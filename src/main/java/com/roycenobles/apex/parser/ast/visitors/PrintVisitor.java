package com.roycenobles.apex.parser.ast.visitors;

import com.roycenobles.apex.parser.ast.ClassNode;
import com.roycenobles.apex.parser.ast.JavaDocNode;
import com.roycenobles.apex.parser.ast.MethodNode;

public class PrintVisitor implements IVisitor {

    public void visit(ClassNode node) {

        if (node.getJavaDoc() != null) {
            node.getJavaDoc().visit(this);
        }

        System.out.println(node.getName());
    }

    public void visit(JavaDocNode node) {
        System.out.println(node.getSource());
    }

    public void visit(MethodNode node) {

    }
}