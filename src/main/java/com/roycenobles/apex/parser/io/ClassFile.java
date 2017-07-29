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

/**
 * Represents an Apex Class with source text and metadata.
 *
 * @author Royce Nobles
 */
public class ClassFile {

    String name;
    String extension;
    String apiVersion;
    String text;
    String meta;

    public String getApiVersion() {
        return this.apiVersion;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }
}