package com.zhangwj;

/**
 * @Description:
 * @author: ZhangWJ
 * @date: 2020年11月18日 15:49
 */
public class StringTest {
    //    public static void main(String[] args) {
//        //创建了多少个对象？
//        String str2 = new String("ABC") + "ABC" ;
//    }
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
