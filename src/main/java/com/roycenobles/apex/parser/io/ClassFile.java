package com.roycenobles.apex.parser.io;

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