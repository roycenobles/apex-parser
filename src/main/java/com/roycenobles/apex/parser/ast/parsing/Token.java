package com.roycenobles.apex.parser.ast.parsing;

public class Token {

    private String text;

    public Token(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
