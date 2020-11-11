package com.zhangwj.jvm;

/**
 * @Description: 添加运行JVM参数： ‐XX:+PrintGCDetails
 * @author: ZhangWJ
 * @date: 2020年11月10日 17:58
 */
public class GCTest {
    public static void main(String[] args) {
        byte[] allocation1, allocation2/*, allocation3, allocation4, allocation, allocation6*/;
        allocation1 = new byte[60000 * 1024];
        //allocation2 = new byte[8000*1024];
        /*allocation3 = new byte[1000*1024];
        allocation4 = new byte[1000*1024];
        allocation5 = new byte[1000*1024];
        allocation6 = new byte[1000*1024];*/
    }
}
