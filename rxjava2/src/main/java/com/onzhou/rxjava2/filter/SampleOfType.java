package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 根据类型过滤, 要使用包装类型比如Integer.class
 */
public class SampleOfType implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, "name", true)
                .ofType(Integer.class).subscribeWith(new CommonObserver<>());
    }
}
