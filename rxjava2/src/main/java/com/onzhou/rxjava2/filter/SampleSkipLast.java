package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 需要跳过后面若干个元素, 或者跳一段时间
 */
public class SampleSkipLast implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skipLast(5).subscribeWith(new CommonObserver<>());
    }
}
