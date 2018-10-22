package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.bean.Student;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;

import java.util.List;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleCast implements InvokePlugin {

    @Override
    public void invoke() {
        Observable.just(1, 2, 3, 4, 5)
                //把每个元素都转换成Number类型,然后再发射
                .cast(Number.class).subscribeWith(new CommonObserver<>());
    }

}
