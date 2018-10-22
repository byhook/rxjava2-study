package com.onzhou.rxjava2.common;

import io.reactivex.functions.Consumer;
import io.reactivex.observers.ResourceObserver;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class CommonComsumer<T> implements Consumer<T> {

    @Override
    public void accept(T t) throws Exception {
        System.out.println("accept " + t);
    }
}
