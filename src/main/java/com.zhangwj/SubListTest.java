package com.zhangwj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: ZhangWJ
 * @date: 2020年11月16日 9:31
 */
public class SubListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        List<String> subList = list.subList(3, 5);
        System.out.println(subList);
    }
}
