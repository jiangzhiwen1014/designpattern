package com.jzwj.creation_pattern.singleton_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: ContainerSingleton
 * @description: 用SingletonManager 将多种的单例类统一管理，在使用时根据key获取对象对应类型的对象。这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class ContainerSingleton {
    private static Map<String, Object> objMap = new HashMap<String, Object>();


    private ContainerSingleton() {
    }


    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }


    public static Object getService(String key) {
        return objMap.get(key);
    }
}