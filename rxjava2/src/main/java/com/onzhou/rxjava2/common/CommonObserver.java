package com.onzhou.rxjava2.common;

import io.reactivex.observers.ResourceObserver;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class CommonObserver<T> extends ResourceObserver<T> {

    @Override
    public void onNext(T t) {
        System.out.println("onNext " + t);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("onError " + e);
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete");
    }
}
