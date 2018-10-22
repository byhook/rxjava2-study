package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.Arrays;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 在被观察发送元素之前追加数据或者追加新的被观察者
 */
public class SampleStartWithArray implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5)
                .startWithArray(7, 8, 9)
                .subscribeWith(new CommonObserver<>());
    }

}
