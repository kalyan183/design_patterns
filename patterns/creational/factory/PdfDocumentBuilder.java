package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public class PdfDocumentBuilder implements DocumentBuilder {
    @Override
    public File generateDocument(List<String> urls, File file) {
        // some implementation
        System.out.println("Starting PDF document builder..");
        return new File("files/test.pdf");
    }
}
