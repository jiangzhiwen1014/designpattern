package com.jzwj.creation_pattern.singleton_pattern;

/**
 * @className: LazySingleton
 * @description: 类加载时就完成了初始化，类加载较慢，但获取对象的速度快，非懒加载
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class HungrySingleton {
    private static HungrySingleton instance;

    private HungrySingleton() {
    }

    public static synchronized HungrySingleton getInstance() {
        if (instance == null) {
            instance = new HungrySingleton();
        }
        return instance;
    }
}