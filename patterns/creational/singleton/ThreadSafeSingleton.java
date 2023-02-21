package org.examples.patterns.creational.singleton;

/**
 * However, the first call to getInstance() will create the object and only the few threads trying to access it during that time need to be synchronized;
 * after that all calls just get a reference to the member variable.
 * Since synchronizing a method could in some extreme cases decrease performance by a factor of 100 or higher,[5]
 * the overhead of acquiring and releasing a lock every time this method is called seems unnecessary:
 * once the initialization has been completed, acquiring and releasing the locks would appear unnecessary.
 * 1) Check that the variable is initialized (without obtaining the lock). If it is initialized, return it immediately.
 * 3) Obtain the lock.
 * 3) Double-check whether the variable has already been initialized: if another thread acquired the lock first, it may have already done the initialization. If so, return the initialized variable.
 * 4) Otherwise, initialize and return the variable.
 */
public class ThreadSafeSingleton {


    private static volatile ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        if(null == INSTANCE) {
            synchronized (ThreadSafeSingleton.class) {
                if(null == INSTANCE) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
