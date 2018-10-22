package com.onzhou.rxjava2.filter;

import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description: 假设有一种即时显示搜索结果需求, 要求一段时间用户不输入才响应请求搜索结果
 */
public class SampleThrottleWithTimeout implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.intervalRange(0, 10, 0, 1, TimeUnit.SECONDS)
                //2秒内有新数据则抛弃旧数据
                //.debounce(2, TimeUnit.SECONDS);
                .throttleWithTimeout(2, TimeUnit.SECONDS).subscribeWith(new CommonObserver<>());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
