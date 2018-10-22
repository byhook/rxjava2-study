package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleIsDefaultIfEmpty implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.empty()
                .defaultIfEmpty(10)
                .subscribe(new CommonComsumer<>());
    }

}
