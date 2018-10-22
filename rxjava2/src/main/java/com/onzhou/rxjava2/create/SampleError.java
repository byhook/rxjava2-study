package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 只会回调onError
 */
public class SampleError implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                .error(new NullPointerException())
                .subscribeWith(new CommonObserver<>());
    }

}
