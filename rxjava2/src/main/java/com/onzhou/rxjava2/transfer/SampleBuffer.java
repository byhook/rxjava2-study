package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: buffer操作符是把多个元素打包成一个元素一次过发送数据
 */
public class SampleBuffer implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .buffer(3).subscribeWith(new CommonObserver<>());
    }

}
