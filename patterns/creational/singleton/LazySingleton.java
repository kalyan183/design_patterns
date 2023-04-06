package org.examples.patterns.creational.singleton;

import java.io.Serializable;

public final class LazySingleton implements Cloneable, Serializable {

    private static LazySingleton instance;

    private LazySingleton() {

        // prevent creation of object using reflection
        if (instance != null) {
            throw new IllegalStateException("Already instantiated");
        }

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone instance of this class");
    }

    // When you also want to be able to serialize your object
    // you need to make sure that deserialization won't create a copy.
    private LazySingleton readResolve() {
        return getInstance();
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
