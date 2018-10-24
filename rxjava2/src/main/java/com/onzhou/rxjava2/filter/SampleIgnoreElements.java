package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import io.reactivex.Observable;
import io.reactivex.functions.Action;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 不关心onNext事件, 只关心onComplete以及onError事件
 */
public class SampleIgnoreElements implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .ignoreElements().subscribe(new Action() {
            @Override
            public void run() throws Exception {
                System.out.println("onComplete");
            }
        });
    }
}
