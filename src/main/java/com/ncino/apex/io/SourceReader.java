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
package com.ncino.apex.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads source code from a File given the path.
 *
 * @author Royce Nobles
 */
class SourceReader {

    /**
     * Reads source code from the specified File.
     *
     * @param filePath the path to the File to be read
     * @return the source code
     * @throws IOException
     */
    String read(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();

        try {
            String line;

            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(LINE_SEPARATOR);
            }

            return stringBuilder.toString();
        }
        finally {
            reader.close();
        }
    }

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
}