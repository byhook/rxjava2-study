package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleAny implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5)
                .any(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) throws Exception {
                        //判断是否有元素等于0
                        return integer == 3;
                    }
                })
                .subscribe(new CommonComsumer<>());
    }

}
