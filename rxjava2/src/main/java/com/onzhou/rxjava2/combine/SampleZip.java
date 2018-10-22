package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import sun.rmi.runtime.Log;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 多个被观察者压缩成单个的操作可以使用zip操作符, 如果多个被观察者数量不同，则以少的为基准
 */
public class SampleZip implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.zip(
                Observable.just(1, 2),
                Observable.just(7, 9),
                (int1, int2) -> int1 + int2)
                .subscribeWith(new CommonObserver<>());
    }

}
