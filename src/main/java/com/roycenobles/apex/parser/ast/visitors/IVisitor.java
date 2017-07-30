package com.roycenobles.apex.parser.ast.visitors;

import com.roycenobles.apex.parser.ast.ClassNode;
import com.roycenobles.apex.parser.ast.JavaDocNode;
import com.roycenobles.apex.parser.ast.MethodNode;

public interface IVisitor {

    void visit(ClassNode node);

    void visit(JavaDocNode node);

    void visit(MethodNode node);
}
