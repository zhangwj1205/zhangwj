package com.zhangwj;

/**
 * @Description: 单例模式(双重检查模式 DCL)
 * @author: ZhangWJ
 * @date: 2020年09月17日 21:14
 */
public class Singleton {
    private Singleton(){

    }
    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
