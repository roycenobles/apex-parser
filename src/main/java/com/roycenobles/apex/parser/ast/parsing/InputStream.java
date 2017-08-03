package com.roycenobles.apex.parser.ast.parsing;

public class InputStream {

    private String input;
    private int index;

    public InputStream(String input) {
        this.input = input;
        this.index = -1;
    }

    public Boolean eof() {
        return (this.peek() == null);
    }

    public Character next() {
        Character next = this.peek();
        if (next != null) this.index++;
        return next;
    }

    public Character peek() {
        Character next = null;
        int ceiling = (this.input != null) ? (this.input.length() - 1) : -1;
        if (this.index < ceiling) {
            next = this.input.charAt(this.index + 1);
        }
        return next;
    }
}