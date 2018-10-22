package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.Arrays;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 遍历集合
 */
public class SampleFromIterable implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                .fromIterable(Arrays.asList(1, 2, 3, 4, 5))
                .subscribeWith(new CommonObserver<>());
    }

}
