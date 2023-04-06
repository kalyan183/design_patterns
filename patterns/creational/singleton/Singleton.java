package org.examples.patterns.creational.singleton;

import java.io.Serializable;

/**
 * The reason why the holder class idiom is thread-safe is that
 * the initialization of the INSTANCE variable is guaranteed to be thread-safe by
 * the Java language specification.
 * When a class is loaded by the JVM, its static variables are initialized in a
 * thread-safe manner.
 * This means that the INSTANCE variable is initialized exactly once,
 * and that the initialization is visible to all threads that access the getInstance method.
 * <p>
 * The use of a private static inner class is also important for ensuring thread safety.
 * The inner class is not loaded until it is referenced,
 * so the INSTANCE variable is not created until the getInstance method is called.
 * Additionally, because the SingletonHolder class is private and not accessible
 * from outside the HolderSingleton class, other classes cannot create instances of the
 * SingletonHolder class, ensuring that the INSTANCE variable is only created once.
 */
public final class Singleton implements Cloneable, Serializable {

    private Singleton() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone instance of this class");
    }

    // When you also want to be able to serialize your object
    // you need to make sure that deserialization won't create a copy.
    private Singleton readResolve() {
        return getInstance();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
