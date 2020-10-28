package test.java.com.zhangwj;

import java.util.Scanner;

/**
 * @Description: 以字符串的形式读入两个数字，再以字符串的形式输出两个数字的和。
 * @author: ZhangWJ
 * @date: 2020年08月16日 19:53
 */
public class MyTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.nextLine().split("\"")[1];
        String num2 = in.nextLine().split("\"")[1];
        int sum = Integer.parseInt(num1)+Integer.parseInt(num2);

        System.out.println("\""+""+sum+"\"");
    }
}
