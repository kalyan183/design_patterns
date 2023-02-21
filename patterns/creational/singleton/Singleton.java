package org.examples.patterns.creational.singleton;

/*
 * The static initialisation block of any class is guaranteed to be single threaded.
 * It is guaranteed to be thread safe because the JVM guarantees that static initializers are executed on a single thread.
 * There is no need for locking as class loading is thread safe.
 * The class is final by default and the constructor cannot be called via reflection.
 * The INSTANCE will not be created until the INSTANCE, or the class is used.
 */
public final class Singleton {

    private Singleton() {

    }


    // The nested class will not be loaded until the first time you call getInstance().
    // If you are worried the class might be accidentally used you can wrap the singleton in an inner class.
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
