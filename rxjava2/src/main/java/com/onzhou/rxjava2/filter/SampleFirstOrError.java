package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 使用firstElement操作符, 如果为空元素的时候不会发生任何异常, 如果你需要在空的时候抛出异常, 可以使用firstOrError操作符
 */
public class SampleFirstOrError implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.empty()
                .firstOrError().subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object value) throws Exception {
                System.out.println(value);
            }
        });
    }
}
