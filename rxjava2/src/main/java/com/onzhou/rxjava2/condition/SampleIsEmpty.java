package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleIsEmpty implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5)
                .isEmpty()
                .subscribe(new CommonComsumer<>());
    }

}
