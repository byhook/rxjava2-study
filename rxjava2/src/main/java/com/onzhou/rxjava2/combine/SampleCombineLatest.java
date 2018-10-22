package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: combineLatest类似zip操作符, 但它合并时机和zip不一样, zip是一对一合并压缩, combineLatest则是在同一个时间线上, 合并最后的元素
 */
public class SampleCombineLatest implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.combineLatest(
                Observable.just(1, 2, 3),
                Observable.intervalRange(0, 5, 1, 1, TimeUnit.SECONDS),
                (int1, int2) -> int1 + int2)
                .subscribeWith(new CommonObserver<>());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
