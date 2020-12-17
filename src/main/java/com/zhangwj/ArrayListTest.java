package com.zhangwj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: ZhangWJ
 * @date: 2020年11月25日 15:39
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list.toString());
    }

}
