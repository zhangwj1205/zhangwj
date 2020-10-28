package test.java.com.zhangwj;

import java.util.Scanner;

/**
 * @Description: 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串（回文串是一个正读和反读都一样的字符串）。
 * 具有不同开始位置或结束位置的回文串，即使是由相同的字符组成，也会被计为是不同的子串。
 * @author: ZhangWJ
 * @date: 2020年08月16日 20:08
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
