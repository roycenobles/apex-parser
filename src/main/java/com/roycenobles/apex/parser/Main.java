package com.roycenobles.apex.parser;

import com.roycenobles.apex.parser.ast.ClassNode;
import com.roycenobles.apex.parser.ast.visitors.PrintVisitor;
import com.roycenobles.apex.parser.io.ClassFile;
import com.roycenobles.apex.parser.io.ClassFileFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/royce/Projects/core/src/classes";

        List<ClassFile> classFiles = ClassFileFactory.create(dir);

        for (ClassFile cf : classFiles) {
            ClassNode node = new ClassNode(cf);
            node.visit(new PrintVisitor());
        }
    }
}