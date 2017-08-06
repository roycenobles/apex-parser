package com.roycenobles.apex;

import com.roycenobles.apex.grammar.ApexBaseListener;
import com.roycenobles.apex.grammar.ApexLexer;
import com.roycenobles.apex.grammar.ApexParser;
import com.roycenobles.apex.io.ClassFile;
import com.roycenobles.apex.io.ClassFileFactory;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.List;

public class Parser {

    public static void main(String[] args) throws IOException {

        String dir = "/home/royce/Downloads/classes";

        System.out.println("Reading classes");

        List<ClassFile> classFiles = ClassFileFactory.create(dir);

        for (ClassFile cf : classFiles) {

            CharStream cs = CharStreams.fromString(cf.getSource());

            ApexLexer lexer = new ApexLexer(cs);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ApexParser parser = new ApexParser(tokens);
            ApexParser.CompilationUnitContext tree = parser.compilationUnit();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new ApexWalker(), tree);
        }
    }

    static class ApexWalker extends ApexBaseListener {

        @Override
        public void enterClassOrInterfaceModifier(ApexParser.ClassOrInterfaceModifierContext ctx) {
            //System.out.println(ctx.APEX_WITH_SHARING());
            //System.out.println(ctx.APEX_WITHOUT_SHARING());
        }

        @Override
        public void enterClassDeclaration(ApexParser.ClassDeclarationContext ctx) {
            System.out.println("Class: " + ctx.Identifier().getText());
        }

        @Override
        public void enterClassBodyDeclaration(ApexParser.ClassBodyDeclarationContext ctx) {

        }

        @Override
        public void enterMethodDeclaration(ApexParser.MethodDeclarationContext ctx) {
            System.out.println(
                    "Method: " + ctx.Identifier().getText() +
                            ", type: " + ctx.type().getText() +
                            ", params: " + ctx.formalParameters().formalParameterList());
        }

        @Override
        public void enterClassOrInterfaceType(ApexParser.ClassOrInterfaceTypeContext ctx) {
            super.enterClassOrInterfaceType(ctx);
        }

        @Override
        public void enterMethodBody(ApexParser.MethodBodyContext ctx) {
        }
    }

}