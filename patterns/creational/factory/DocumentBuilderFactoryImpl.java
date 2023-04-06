package org.examples.patterns.creational.factory;

/**
 * Factory pattern introduces loose coupling between classes.
 * If object creation code is spread in the whole application,
 * and if you need to change the process of object creation
 * then you need to go in each and every place to make necessary changes.
 */
public class DocumentBuilderFactoryImpl implements DocumentBuilderFactory{


    private final PdfDocumentBuilder pdfDocumentBuilder;
    private final WordDocumentBuilder wordDocumentBuilder;
    private final ExcelDocumentBuilder excelDocumentBuilder;

    public DocumentBuilderFactoryImpl(final PdfDocumentBuilder pdfDocumentBuilder,
                                      final WordDocumentBuilder wordDocumentBuilder,
                                      final ExcelDocumentBuilder excelDocumentBuilder) {
        this.pdfDocumentBuilder = pdfDocumentBuilder;
        this.wordDocumentBuilder = wordDocumentBuilder;
        this.excelDocumentBuilder = excelDocumentBuilder;
    }


    @Override
    public DocumentBuilder getDocumentBuilder(DocTypes types) {

        return switch (types) {
            case PDF -> pdfDocumentBuilder;
            case EXCEL -> excelDocumentBuilder;
            default -> wordDocumentBuilder;
        };
    }
}
