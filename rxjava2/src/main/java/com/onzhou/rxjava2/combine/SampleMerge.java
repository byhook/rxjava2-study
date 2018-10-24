package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: merge操作符可以合并并行执行, 最多支持4个
 */
public class SampleMerge implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.merge(
                Observable.intervalRange(0, 3, 1, 1, TimeUnit.SECONDS),
                Observable.intervalRange(3, 3, 1, 1, TimeUnit.SECONDS)
        ).subscribeWith(new CommonObserver<>());

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
