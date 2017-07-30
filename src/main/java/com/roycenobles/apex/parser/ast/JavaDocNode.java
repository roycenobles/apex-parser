package com.roycenobles.apex.parser.ast;

import com.roycenobles.apex.parser.ast.visitors.IVisitor;

public class JavaDocNode {

    private String source;

    public JavaDocNode(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void visit(IVisitor visitor) {
        visitor.visit(this);
    }
}