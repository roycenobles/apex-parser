package com.roycenobles.apex;

import com.roycenobles.apex.grammar.ApexLexer;
import com.roycenobles.apex.grammar.ApexParser;
import com.roycenobles.apex.io.ClassFile;
import com.roycenobles.apex.io.ClassFileFactory;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

public class Parser {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/royce/Projects/core/src/classes";

        List<ClassFile> classFiles = ClassFileFactory.create(dir);

        for (ClassFile cf : classFiles) {

            CharStream cs = CharStreams.fromString(cf.getSource());

            ApexLexer lexer = new ApexLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ApexParser parser = new ApexParser(tokens);
            ApexParser.CompilationUnitContext tree = parser.compilationUnit();


            // ClassNode node = new ClassNode(cf);
            // node.visit(new PrintVisitor());
        }
    }
}