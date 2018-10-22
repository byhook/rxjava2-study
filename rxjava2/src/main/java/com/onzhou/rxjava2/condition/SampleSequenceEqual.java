package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 如果要对比两个被观察者发射的元素队列, 可以使用sequenceEqual操作符, 它只关心两个发射队列的元素、元素发射顺序、和最终状态,而不关心他的时间
 */
public class SampleSequenceEqual implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.sequenceEqual(
                Observable.just(0L, 1L, 2L),
                Observable.intervalRange(0, 3, 0, 1, TimeUnit.SECONDS))
                .subscribe(new CommonComsumer<>());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
