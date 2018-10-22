package com.onzhou.rxjava2.create;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleCreate implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(520);
                emitter.onComplete();
            }
        }).subscribeWith(new CommonObserver<>());
    }

}
