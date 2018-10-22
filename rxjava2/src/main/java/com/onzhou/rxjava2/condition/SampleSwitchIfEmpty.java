package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleSwitchIfEmpty implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.empty()
                .switchIfEmpty(Observable.just(1, 2, 3))
                .subscribe(new CommonComsumer<>());
    }

}
