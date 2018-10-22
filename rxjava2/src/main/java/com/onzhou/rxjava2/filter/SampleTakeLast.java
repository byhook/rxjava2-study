package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 只发射最后N个元素
 */
public class SampleTakeLast implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .takeLast(5)
                .subscribeWith(new CommonObserver<>());
    }
}
