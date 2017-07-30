package com.roycenobles.apex.parser.ast;

import com.roycenobles.apex.parser.ast.visitors.IVisitor;

public class MethodNode {



    public void visit(IVisitor visitor) {
        visitor.visit(this);
    }
}
