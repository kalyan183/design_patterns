package org.examples.patterns.creational.factory;

public interface DocumentBuilderFactory {

    DocumentBuilder getDocumentBuilder(DocTypes types);
}
