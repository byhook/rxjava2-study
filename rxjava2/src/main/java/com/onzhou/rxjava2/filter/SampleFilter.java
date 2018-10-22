package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleFilter implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5, 6, 7)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer value) throws Exception {
                        return value % 2 == 0;
                    }
                }).subscribeWith(new CommonObserver<>());
    }
}
