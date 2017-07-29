package com.roycenobles.apex.parser;

import com.roycenobles.apex.parser.io.ClassFile;
import com.roycenobles.apex.parser.io.ClassFileFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/royce/Projects/core/src/classes";

        List<ClassFile> classFiles = ClassFileFactory.create(dir);

        System.out.println("Parsed " + classFiles.size() + " Apex Classes:");

        for (ClassFile cf : classFiles) {
            System.out.println(cf.getName());
            System.out.println(" - api: " + cf.getApiVersion());
            System.out.println(" - ext: " + cf.getExtension());
            System.out.println();
        }
    }
}