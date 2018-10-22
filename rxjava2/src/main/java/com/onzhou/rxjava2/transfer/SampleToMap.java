package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 根据每个数据进行分组
 */
public class SampleToMap implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .toMap(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) throws Exception {
                        return integer >= 5 ? "A组" : "B组";
                    }
                }).subscribe(new CommonComsumer<>());
    }

}
