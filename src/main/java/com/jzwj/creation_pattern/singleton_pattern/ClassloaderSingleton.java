package com.jzwj.creation_pattern.singleton_pattern;

/**
 * @className: ClassloaderSingleton
 * @description: 基于 classloader 机制.线程安全
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class ClassloaderSingleton {
    private static ClassloaderSingleton instance = new ClassloaderSingleton();
    private ClassloaderSingleton(){}
    public static ClassloaderSingleton getInstance() {
        return instance;
    }
}