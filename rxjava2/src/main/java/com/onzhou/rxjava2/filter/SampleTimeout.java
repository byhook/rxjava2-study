package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 过滤超时操作
 */
public class SampleTimeout implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.intervalRange(0, 10, 0, 2, TimeUnit.SECONDS)
                .timeout(1, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
