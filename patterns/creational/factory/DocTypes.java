package org.examples.patterns.creational.factory;

public enum DocTypes {

    PDF("pdf"),
    WORD("word"),
    EXCEL("excel");

    private final String name;

    DocTypes(String name) {
        this.name = name;
    }

    public static String fromName(String  name) {

        for(DocTypes docTypes : DocTypes.values()) {
            if(docTypes.name.equals(name)) {
                return name;
            }
        }
        return null;
    }
}
