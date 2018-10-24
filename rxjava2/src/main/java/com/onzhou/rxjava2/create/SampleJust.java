package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 将单个数据转换为发射那个数据的Observable
 */
public class SampleJust implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                //最多支持10个数据元素
                .just(1, 2, 3, 4, 5)
                .subscribeWith(new CommonObserver<>());
    }

}
