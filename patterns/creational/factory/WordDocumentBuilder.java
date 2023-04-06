package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public class WordDocumentBuilder implements DocumentBuilder {

    @Override
    public File generateDocument(List<String> urls, File file) {
        // some implementation
        System.out.println("Starting Word document builder..");
        return new File("files/test.doc");
    }
}
