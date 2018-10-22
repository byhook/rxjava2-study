package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;
import sun.rmi.runtime.Log;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 根据每个数据进行分组
 */
public class SampleGroupBy implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .groupBy(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) throws Exception {
                        return integer >= 5 ? "A组" : "B组";
                    }
                }).subscribe(new Consumer<GroupedObservable<String, Integer>>() {
            @Override
            public void accept(GroupedObservable<String, Integer> observable) throws Exception {
                observable.subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        String key = observable.getKey();
                        System.out.println(key + ":" + String.valueOf(integer));
                    }
                });
            }
        });
    }

}
