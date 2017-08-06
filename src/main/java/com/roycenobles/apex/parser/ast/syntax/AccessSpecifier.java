package com.roycenobles.apex.parser.ast.syntax;

/**
 * Represents the different accessibility specifiers in Apex.
 */
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