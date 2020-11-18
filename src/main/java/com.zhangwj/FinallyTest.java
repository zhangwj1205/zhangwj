package com.zhangwj;

/**
 * @Description:
 * @author: ZhangWJ
 * @date: 2020年11月18日 15:08
 */
public class FinallyTest {
    public static int test() {
        try {
            return 6;
        } finally {
            return 7;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
