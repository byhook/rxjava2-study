package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

import java.util.concurrent.Callable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 观察者可以订阅多个观察者
 */
public class SampleDefer implements InvokePlugin {

    @Override
    public void invoke() {
        Observable<String> observable = Observable.defer(new Callable<ObservableSource<String>>() {
            @Override
            public ObservableSource<String> call() throws Exception {
                return Observable.just("hello", "world");
            }
        });
        //订阅第一个观察者
        observable.subscribeWith(new CommonObserver<>());
        //订阅第二个观察者
        observable.subscribeWith(new CommonObserver<>());
    }

}
