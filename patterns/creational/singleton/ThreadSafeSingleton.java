package org.examples.patterns.creational.singleton;

import java.io.Serializable;

/**
 * In the getInstance method, we first check if the instance variable is null.
 * If it is null, we acquire a lock on the DoubleCheckedLockingSingleton class using the synchronized keyword.
 * We then check the instance variable again to ensure that no other thread has created an instance
 * while we were waiting to acquire the lock.
 * <p>
 */
public final class ThreadSafeSingleton implements Cloneable, Serializable {

    // The volatile keyword ensures that changes made to the instance variable are immediately visible to all threads
    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {

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
    private ThreadSafeSingleton readResolve() {
        return getInstance();
    }

    public static ThreadSafeSingleton getInstance() {
        // The first check for null ensures that we don't synchronize unnecessarily
        if (null == instance) {
            synchronized (ThreadSafeSingleton.class) {
                // the second check ensures that we don't create multiple instances
                // if multiple threads enter the synchronized block.
                if (null == instance) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;

    }
}
