package test.java.com.zhangwj;

/**
 * @Description: 单例模式
 * @author: ZhangWJ
 * @date: 2020年09月17日 21:14
 */
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance = null;

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
