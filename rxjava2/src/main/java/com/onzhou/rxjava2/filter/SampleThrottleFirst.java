package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 连续时间内只响应一次操作
 */
public class SampleThrottleFirst implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.intervalRange(0, 6, 0, 1, TimeUnit.SECONDS)
                //每秒中只处理第一个数据
                .throttleFirst(1, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
