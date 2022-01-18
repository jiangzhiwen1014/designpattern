package com.jzwj.creation_pattern.singleton_pattern;

/**
 * @className: DclSingleton
 * @description: 在getSingleton方法中对singleton进行了两次判空, 第一次是为了不必要的同步，第二次是在singleton等于null的情况下才创建实例
 * 使用volatile会影响性能,DCL优点是资源利用率高第一次执行getInstance时单例,对象才被实例化，效率高。缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，发生的概率很小,极小几率会发现线程安全的问题
 * @author: jiangzhiwen
 * @date: 2022/1/17
 **/
public class DclSingleton {
    private volatile static DclSingleton dclSingleton;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DclSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DclSingleton();
                }
            }
        }
        return dclSingleton;
    }
}