package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleToList implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .toList().subscribe(new CommonComsumer<>());
    }

}
