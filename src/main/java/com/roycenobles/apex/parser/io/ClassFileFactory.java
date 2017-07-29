package com.roycenobles.apex.parser.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ClassFileFactory {

    public static List<ClassFile> create(String classPath) throws IOException {

        Map<String,ClassFile> fileMap = new HashMap<String, ClassFile>();

        File classDirectory = new File(classPath);

        if (!classDirectory.isDirectory()) {
            // todo: throw exception?
            return null;
        }

        for (File file : classDirectory.listFiles()) {

            // todo: factor this out into constituent parts

            String[] parts = file.getName().split("\\.");

            if (parts.length < 2) continue;

            String name = parts[0];
            String extension = (parts.length == 2) ? parts[1] : parts[1] + "." + parts[2];

            ClassFile cf = fileMap.get(name);

            if (cf == null) {
                cf = new ClassFile();
                fileMap.put(name, cf);
            }

           // System.out.println("name: " + name + " extension: " + extension);

            if (extension.equals("cls")) {
                // set everything else
                cf.name = name;
                cf.extension = extension;
                cf.text = readFile(file.getPath());
            }
            else if (extension.equals("cls-meta.xml")) {
                // set api version
                cf.meta = readFile(file.getPath());

                int start = cf.meta.indexOf("<apiVersion>");
                int end = cf.meta.indexOf("</apiVersion>");

                if (start < end) {
                    start += 12;
                    cf.apiVersion = cf.meta.substring(start, end);
                }
            }
        }

        return new ArrayList<ClassFile>(fileMap.values());
    }

    private static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

}
