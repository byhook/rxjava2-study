package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 指定发射第几个元素, 越界不会抛出异常
 */
public class SampleElementAt implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7)
                .elementAt(3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) throws Exception {
                System.out.println(value);
            }
        });
    }
}
