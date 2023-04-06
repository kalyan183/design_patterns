package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public class ExcelDocumentBuilder implements DocumentBuilder {

    @Override
    public File generateDocument(List<String> urls, File file) {
        System.out.println("Starting Excel document builder..");
        return new File("files/test.doc");
    }
}
