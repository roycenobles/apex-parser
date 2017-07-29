/*
 * Licensed under MIT (https://github.com/roycenobles/apex-parser/blob/master/LICENSE)
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.roycenobles.apex.parser.io;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Factory for building ClassFile objects from Apex source code.
 *
 * @author Royce Nobles
 */
public class ClassFileFactory {

    /**
     * Creates a List of ClassFile objects by reading from the SalesForce Classes directory.
     *
     * @param classPath Path to the Classes directory
     * @return the List of ClassFile objects
     * @throws IOException
     */
    public static List<ClassFile> create(String classPath) throws IOException {

        Map<String,ClassFile> fileMap = new HashMap<String, ClassFile>();

        File cd = new File(classPath);

        if (!cd.isDirectory())
            throw new IOException(String.format("Parameter (%s) is not a directory", classPath));

        SourceReader reader = new SourceReader();

        for (File file : cd.listFiles()) { // iterate over all files in directory

            String[] parts = file.getName().split("\\.");

            if (parts.length < 2) continue; // invalid file name

            String name = parts[0];

            String extension = (parts.length == 2)
                ? parts[1]
                : String.format("%s.%s", parts[1], parts[2]);

            ClassFile cf = fileMap.get(name);

            if (cf == null) { // create an entry in the file map
                cf = new ClassFile();
                fileMap.put(name, cf);
            }

            if (extension.equals(CLASS_EXTENSION)) {
                // gather information from source file
                cf.name = name;
                cf.extension = extension;
                cf.source = reader.read(file.getPath());
            }
            else if (extension.equals(META_EXTENSION)) {
                // gather information from metadata file
                cf.metadata = reader.read(file.getPath());

                int start = cf.metadata.indexOf(API_VERSION_START);
                int end = cf.metadata.indexOf(API_VERSION_END);

                if (start < end) { // parse api version from metadata xml
                    start += API_VERSION_START.length();
                    cf.apiVersion = cf.metadata.substring(start, end);
                }
            }
        }

        return new ArrayList<ClassFile>(fileMap.values());
    }

    private static final String
        API_VERSION_START = "<apiVersion>",
        API_VERSION_END = "</apiVersion>",
        CLASS_EXTENSION = "cls",
        META_EXTENSION = "cls-meta.xml";
}