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

/**
 * Represents an Apex Class with source source and metadata.
 *
 * @author Royce Nobles
 */
public class ClassFile {

    String name;
    String extension;
    String apiVersion;
    String source;
    String metadata;

    /**
     * Gets the API Version of the ClassFile.
     *
     * @return the API Version
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Gets the ClassFile extension.
     *
     * @return the extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * Gets the ClassFile Metadata.
     *
     * @return the Metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Gets the name of the Apex ClassFile.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the Apex ClassFile source code.
     *
     * @return the source code
     */
    public String getSource() {
        return this.source;
    }
}
