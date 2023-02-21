package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public class PdfDocumentBuilder implements DocumentBuilder{
    @Override
    public File generateDocument(List<String> urls, File file) {
        // some implementation
        return null;
    }
}
