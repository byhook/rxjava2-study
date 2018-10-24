package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 取第一个元素, 如果为空元素的时候不会发生任何异常
 */
public class SampleFirstElement implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7)
                .firstElement().subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) throws Exception {
                System.out.println("accept: " + value);
            }
        });
    }
}
