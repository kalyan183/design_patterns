package org.examples.patterns.creational.singleton;

public final class DefaultSingleton {

    private DefaultSingleton() {}

    private static DefaultSingleton defaultSingleton;

    public static DefaultSingleton getDefaultSingleton() {

        if(null == defaultSingleton) {
            defaultSingleton = new DefaultSingleton();
        }
        return  defaultSingleton;
    }

}
