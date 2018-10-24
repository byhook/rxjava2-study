package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 如果想过滤掉重复的元素, 可以使用此操作符：
 */
public class SampleDistinct implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 1, 3, 1, 2)
                .distinct().subscribe(new CommonComsumer<>());
    }
}
