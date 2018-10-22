package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Predicate;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleAll implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5)
                .all(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) throws Exception {
                        //判断是否所有元素都大于等于0
                        return integer >= 0;
                    }
                })
                .subscribe(new CommonComsumer<>());
    }

}
