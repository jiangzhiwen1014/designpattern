package com.jzwj.creation_pattern.singleton_pattern;

/**
 * @className: LazySingleton
 * @description:  lazy loading 很明显，线程不安全
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}