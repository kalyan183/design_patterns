package org.examples.patterns.creational.singleton;

public class SingletonRunner {

    public static void main(String[] args) throws CloneNotSupportedException {

        LazySingleton singleton = LazySingleton.getInstance();

    }
}
