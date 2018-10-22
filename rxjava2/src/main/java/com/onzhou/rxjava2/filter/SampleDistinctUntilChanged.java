package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 只会过滤连续重复的元素
 */
public class SampleDistinctUntilChanged implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 1, 2, 6, 7)
                .distinctUntilChanged().subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) throws Exception {
                System.out.println(value);
            }
        });
    }
}
