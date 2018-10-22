package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: skipUntil操作符接收一个被观察者, 直到该被观察者发送事件之前, 第一个被观察者所有发送的元素将被抛弃
 */
public class SampleSkipUntil implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.intervalRange(0, 10, 0, 1, TimeUnit.SECONDS)
                .skipUntil(Observable.timer(3, TimeUnit.SECONDS))
                .subscribe(new CommonComsumer<>());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
