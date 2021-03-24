package com.chenqi.creationtype.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description : CAS
 * @Author : chen qi
 * @Date: 2021-03-24 10:37
 */
public class Singleton06 {
    private static final AtomicReference<Singleton06> INSTANCE = new AtomicReference<>();
    private static Singleton06 instance;

    private Singleton06() {

    }

    public static final Singleton06 getInstance() {
        for (; ; ) {
            Singleton06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton06());
            return INSTANCE.get();
        }
    }
}
