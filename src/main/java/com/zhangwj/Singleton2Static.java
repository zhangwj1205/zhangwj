package com.zhangwj;

/**
 * @Description: 单例模式(静态内部类模式)
 * @author: ZhangWJ
 * @date: 2020年09月17日 21:14
 */
public class Singleton2Static {

    private Singleton2Static() {

    }

    private static volatile Singleton2Static instance = null;

    public static Singleton2Static getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton2Static sInstance = new Singleton2Static();
    }
}
