package com.roycenobles.apex.parser.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ClassFileFactory {

    public static List<ClassFile> create(String classPath) throws IOException {

        Map<String,ClassFile> fileMap = new HashMap<String, ClassFile>();

        File cd = new File(classPath);

        if (!cd.isDirectory()) throw new IOException("Parameter: [" + classPath + "] is not a directory.");

        for (File file : cd.listFiles()) { // iterate over all files in directory

            String[] parts = file.getName().split("\\.");

            if (parts.length < 2) continue; // invalid file name

            String name = parts[0];
            String extension = (parts.length == 2) ? parts[1] : parts[1] + "." + parts[2];

            ClassFile cf = fileMap.get(name);

            if (cf == null) { // create an entry in the file map
                cf = new ClassFile();
                fileMap.put(name, cf);
            }

            if (extension.equals(CLASS_EXTENSION)) {
                // gather information from source file
                cf.name = name;
                cf.extension = extension;
                cf.text = readFile(file.getPath());
            }
            else if (extension.equals(META_EXTENSION)) {
                // gather information from metadata file
                cf.meta = readFile(file.getPath());

                int start = cf.meta.indexOf(API_VERSION_START);
                int end = cf.meta.indexOf(API_VERSION_END);

                if (start < end) { // located api version in meta xml
                    start += 12;
                    cf.apiVersion = cf.meta.substring(start, end);
                }
            }
        }

        return new ArrayList<ClassFile>(fileMap.values());
    }

    private static String readFile(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();

        try {
            String line;

            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(LINE_SEPARATOR);
            }

            return stringBuilder.toString();
        }
        finally {
            reader.close();
        }
    }

    private static final String
        LINE_SEPARATOR = System.getProperty("line.separator"),
        API_VERSION_START = "<apiVersion>",
        API_VERSION_END = "</apiVersion>",
        CLASS_EXTENSION = "cls",
        META_EXTENSION = "cls-meta.xml";
}