package com.onzhou.rxjava2.combine;

import com.onzhou.rxjava2.common.CommonComsumer;
import com.onzhou.rxjava2.plugin.InvokePlugin;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 聚合元素, 但它需要自己定义收集的容器和收集逻辑
 */
public class SampleCollect implements InvokePlugin {

    @Override
    public void invoke() {
        Observable
                .just(1, 2, 3)
                .collect(new Callable<ArrayList<Integer>>() {
                    @Override
                    public ArrayList<Integer> call() throws Exception {
                        return new ArrayList<>();
                    }
                }, new BiConsumer<ArrayList<Integer>, Integer>() {
                    @Override
                    public void accept(ArrayList<Integer> list, Integer value) throws Exception {
                        System.out.println("add element " + value);
                        list.add(value);
                    }
                })
                .subscribe(new CommonComsumer<>());
    }

}
