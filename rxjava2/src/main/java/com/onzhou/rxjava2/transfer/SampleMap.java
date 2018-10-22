package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 基本的转换操作符, 可以把每一个元素转换成新的元素发射
 */
public class SampleMap implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5)
                .map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) throws Exception {
                        return "apply " + integer;
                    }
                })
                .subscribe(new CommonComsumer<>());
    }

}
