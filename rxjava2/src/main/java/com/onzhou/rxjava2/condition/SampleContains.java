package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 判断被观察者是否包含某一个元素
 */
public class SampleContains implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3)
                .contains(2)
                .subscribe(new CommonComsumer<>());
    }

}
