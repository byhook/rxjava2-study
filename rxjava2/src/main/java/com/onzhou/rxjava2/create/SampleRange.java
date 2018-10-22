package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 指定范围内发送数据, 还有一个对应的rangeLong
 */
public class SampleRange implements InvokePlugin {

    @Override
    public void invoke() {
        //指定发送范围
        Observable.range(0, 5).subscribeWith(new CommonObserver<>());
    }

}
