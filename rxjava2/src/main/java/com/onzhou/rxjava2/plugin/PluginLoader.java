package com.onzhou.rxjava2.plugin;

/**
 * @author: andy
 * @date: 2018-10-22
 * @description:
 */
public class PluginLoader {

    public static <T> T loadService(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
