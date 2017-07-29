package com.roycenobles.apex.parser.syntax;

public enum AccessSpecifier {
    GLOBAL("global"),
    PUBLIC("public"),
    PRIVATE("private");

    // todo: is "protected" an access specifier or something else?

    private String text;

    AccessSpecifier(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }
}