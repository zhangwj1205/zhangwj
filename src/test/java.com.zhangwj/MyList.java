package test.java.com.zhangwj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: list遍历修改
 * @author: ZhangWJ
 * @date: 2020年10月20日 14:22
 */
public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        list.add("Test5");
        list.removeIf(s -> s.equals("Test3"));
        for(String s : list){
            System.out.println(s);
        }
    }
}
