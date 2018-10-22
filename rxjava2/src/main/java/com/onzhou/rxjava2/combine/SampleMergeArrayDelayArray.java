package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 使用concat和merge操作符时,
 * 如果遇到其中一个被观察者发出onError事件则会马上终止其他被观察者的事件,
 * 如果希望onError事件推迟到其他被观察者都结束后才触发,
 * 可以使用对应的concatDelayError或者mergeDelayError操作符
 */
public class SampleMergeArrayDelayArray implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.mergeArrayDelayError(Observable.error(new NullPointerException()), Observable.empty())
                .subscribeWith(new CommonObserver<>());
    }

}
