package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.bean.Student;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleSwitchMap implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2)
                .switchMap(value -> {
                    return Observable.timer(1, TimeUnit.SECONDS).map(longValue -> value);
                }).subscribeWith(new CommonObserver<>());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
