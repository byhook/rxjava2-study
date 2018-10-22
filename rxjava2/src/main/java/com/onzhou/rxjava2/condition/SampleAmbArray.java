package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleAmbArray implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.ambArray(
                Observable.timer(1, TimeUnit.SECONDS),
                //仅处理第一个发射元素的被观察者
                Observable.just(3, 4, 5))
                .subscribe(new CommonComsumer<>());
    }

}
