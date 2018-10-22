package com.onzhou.rxjava2.transfer;

import com.onzhou.rxjava2.bean.Student;
import com.onzhou.rxjava2.common.CommonObserver;
import com.onzhou.rxjava2.plugin.InvokePlugin;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.observers.ResourceObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class SampleFlatMap implements InvokePlugin {

    @Override
    public void invoke() {
        List<Student> students = Student.create();
        Observable.fromIterable(students)
                .flatMap(value -> {
                    return Observable.fromIterable(value.courses);
                }).subscribeWith(new CommonObserver<>());
    }

}
