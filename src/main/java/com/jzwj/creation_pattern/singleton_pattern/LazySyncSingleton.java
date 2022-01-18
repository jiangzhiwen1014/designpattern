package com.jzwj.creation_pattern.singleton_pattern;

/**
 * @className: LazySyncSingleton
 * @description: 单例加锁，性能低下
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class LazySyncSingleton {
    private static LazySyncSingleton instance;
    private LazySyncSingleton(){}
    public static synchronized LazySyncSingleton getInstance() {
        if (instance == null) {
            instance = new LazySyncSingleton();
        }
        return instance;
    }
}