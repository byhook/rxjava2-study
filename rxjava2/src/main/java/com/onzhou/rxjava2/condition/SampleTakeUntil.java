package com.onzhou.rxjava2.condition;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 如果想执行到某个条件就停止事件
 */
public class SampleTakeUntil implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(0, 1, 2, 3, 4, 5, 6, 7)
                .takeUntil(integer -> integer == 2)
                .subscribe(new CommonComsumer<>());

    }

}
