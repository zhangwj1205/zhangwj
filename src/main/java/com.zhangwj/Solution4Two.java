package com.zhangwj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @Description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @author: ZhangWJ
 * @date: 2020年12月01日 16:33
 */
public class Solution4Two {

    /**
     * @param nums 数组
     * @param target 预期值
     * @return int[]
     * @Description: 哈希表法
     * @author ZhangWJ
     * @date 2020/12/1 16:43
     */
    public static int[] solution4Hash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15, 23, 5, 8};
        System.out.println(Arrays.toString(solution4Hash(nums, 16)));
    }
}
