package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.bean.Student;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

import java.util.List;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 扫描每一个元素, 第一个元素将忽略, 从第二个元素开始（可以获得上一个元素的值）进行变换后返回
 */
public class SampleScan implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5)
                .scan(new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer value1, Integer value2) throws Exception {
                        return value2 + 1;
                    }
                }).subscribeWith(new CommonObserver<>());
    }

}
