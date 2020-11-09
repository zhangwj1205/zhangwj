package com.zhangwj.jvm;

/**
 * @Description: StackOverflowError示例：
 * JVM设置 ‐Xss128k(默认1M)
 * @author: ZhangWJ
 * @date: 2020年11月09日 18:12
 */
public class StackOverflowTest {
    static int count = 0;

    static void redo() {
        count++;
        redo();
    }

    public static void main(String[] args) {
        try {
            redo();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(count);
        }
    }

}
