package com.onzhou.rxjava2;

import com.onzhou.rxjava2.condition.*;
import com.onzhou.rxjava2.plugin.PluginLoader;
import com.onzhou.rxjava2.transfer.SampleBuffer;
import com.onzhou.rxjava2.transfer.SampleCast;
import com.onzhou.rxjava2.transfer.SampleConcatMap;
import com.onzhou.rxjava2.transfer.SampleFlatMap;
import com.onzhou.rxjava2.transfer.SampleFlatMapIterable;
import com.onzhou.rxjava2.transfer.SampleGroupBy;
import com.onzhou.rxjava2.transfer.SampleMap;
import com.onzhou.rxjava2.transfer.SampleScan;
import com.onzhou.rxjava2.transfer.SampleSwitchMap;
import com.onzhou.rxjava2.transfer.SampleToList;
import com.onzhou.rxjava2.transfer.SampleToMap;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        PluginLoader.loadService(SampleGroupBy.class).invoke();
    }

}
