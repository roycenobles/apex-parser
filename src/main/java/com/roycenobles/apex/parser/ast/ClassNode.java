package com.roycenobles.apex.parser.ast;

import com.roycenobles.apex.parser.ast.visitors.IVisitor;
import com.roycenobles.apex.io.ClassFile;
import java.util.ArrayList;
import java.util.List;

public class ClassNode {

    private String name;
    private JavaDocNode javaDoc;
    private List<ClassNode> children;
    private List<MethodNode> methods;

    private ClassNode() {
        this.children = new ArrayList<ClassNode>();
        this.methods = new ArrayList<MethodNode>();
    }

    public ClassNode(ClassFile cf) {
        this();
        this.name = cf.getName();
        this.javaDoc = this.parseJavaDoc(cf.getSource());
    }

    public List<ClassNode> getChildren() {
        return this.children;
    }

    public JavaDocNode getJavaDoc() {
        return this.javaDoc;
    }

    public List<MethodNode> getMethods() {
        return methods;
    }

    public String getName() {
        return this.name;
    }

    public void visit(IVisitor visitor) {
        visitor.visit(this);
    }

    private JavaDocNode parseJavaDoc(String source) {

        // todo: this is naive and does not handle inner clases or interfaces

        // instead, try reading line by line, top to bottom and tokenize

        int jdStart = source.indexOf("/**");
        int jdEnd = source.indexOf("*/");
        int cStart = source.indexOf("class");
        int cName = source.indexOf(this.name);

        JavaDocNode node = null;

        if (jdStart > -1 && jdStart < jdEnd  && jdEnd < cStart  && cStart < cName) {
            node = new JavaDocNode(source.substring(jdStart, jdEnd + 2));
        }

        return node;
    }
}