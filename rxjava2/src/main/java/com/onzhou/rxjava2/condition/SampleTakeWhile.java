package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: takeWhile操作符和takeUntil操作符类似, 但是takeWhile只接受Predicate,而且Predicate中的test方法返回true才执行被观察者的事件
 */
public class SampleTakeWhile implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5, 6, 7)
                .takeWhile(integer -> integer != 5)
                .subscribe(new CommonComsumer<>());

    }

}
