package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 它的功能和sample操作符相同, 都是隔一段时间采集一个元素
 */
public class SampleThrottleLast implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.intervalRange(0, 10, 0, 1, TimeUnit.SECONDS)
                //每秒中只处理第一个数据
                //.sample(1, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
                .throttleLast(1, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
