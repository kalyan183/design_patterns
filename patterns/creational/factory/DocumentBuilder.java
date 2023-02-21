package org.examples.patterns.creational.factory;

import java.io.File;
import java.util.List;

public interface DocumentBuilder {

    File generateDocument(List<String> urls, File file);
}
