package com.onzhou.rxjava2;

import com.onzhou.rxjava2.combine.*;
import com.onzhou.rxjava2.condition.*;
import com.onzhou.rxjava2.plugin.PluginLoader;
import com.onzhou.rxjava2.transfer.*;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        PluginLoader.loadService(SampleMap.class).invoke();
    }

}
