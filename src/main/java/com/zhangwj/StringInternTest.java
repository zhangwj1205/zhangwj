package com.zhangwj;

/**
 * @Description:
 * @author: ZhangWJ
 * @date: 2020年11月16日 18:39
 */
public class StringInternTest {
    public static void main(String[] args) {
        String s1 = new String("zhuge");
        String s2 = s1.intern();
        System.out.println(s1 == s2);  //false

        String s3 = "zhuge";
        String s4 = s3.intern();
        System.out.println(s3 == s4);  //true

        String s5 = new String("he") + new String("llo");
        String s6 = s5.intern();

        System.out.println(s5 == s6);
        // 在 JDK 1.6 下输出是 false，创建了 6 个对象
        // 在 JDK 1.7 及以上的版本输出是 true，创建了 5 个对象
        // 当然我们这里没有考虑GC，但这些对象确实存在或存在过
    }
}
