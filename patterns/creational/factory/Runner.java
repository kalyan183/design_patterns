package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        PdfDocumentBuilder pdfBuilder = new PdfDocumentBuilder();
        ExcelDocumentBuilder excelBuilder = new ExcelDocumentBuilder();
        WordDocumentBuilder docBuilder = new WordDocumentBuilder();

        DocumentBuilderFactory factory = new DocumentBuilderFactoryImpl(pdfBuilder, docBuilder, excelBuilder);

        DocTypes types = DocTypes.PDF;
        DocumentBuilder builder = factory.getDocumentBuilder(types);

        builder.generateDocument(List.of("url1", "url2", "url3"), new File(""));
        System.out.println("Completed " + types + " document builder generation.");
    }
}
