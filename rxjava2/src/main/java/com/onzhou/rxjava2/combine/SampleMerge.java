package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: merge操作符可以合并并行执行, 最多支持4个
 */
public class SampleMerge implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.merge(Observable.just(1, 2), Observable.just(3, 4), Observable.just(5, 6), Observable.just(7, 8))
                .subscribeWith(new CommonObserver<>());
    }

}
