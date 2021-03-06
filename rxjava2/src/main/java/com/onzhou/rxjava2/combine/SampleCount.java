package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 聚合元素, 但它需要自己定义收集的容器和收集逻辑
 */
public class SampleCount implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                .just(1, 2, 3)
                .count()
                .subscribe(new CommonComsumer<>());
    }

}
