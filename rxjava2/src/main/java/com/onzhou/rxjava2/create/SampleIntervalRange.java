package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 指定发送范围, 时间间隔操作符, 不间断的发送, onComplete会停止发送
 */
public class SampleIntervalRange implements InvokePlugin {

    @Override
    public void invoke() {
        //指定发送范围
        Observable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
