package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: reduce聚合操作符
 */
public class SampleReduce implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                .just(1, 2, 3)
                .reduce((last, item) -> {
                    //先执行1+2，然后用1+2的结果和3相加，最后输出6，相当于把三个元素聚合在一起
                    return last + item;
                })
                .subscribe(new CommonComsumer<>());
    }

}
