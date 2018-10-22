package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: concat操作符可以连接最多4个的被观察者, 串行执行
 */
public class SampleConcat implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.concat(Observable.just(1, 2), Observable.just(3, 4, 5), Observable.just(7, 8, 9))
                .subscribeWith(new CommonObserver<>());
    }

}
