package com.zhangwj;

/**
 * @Description: 快速排序
 * @author: ZhangWJ
 * @date: 2020年10月27日 9:30
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22, 11, 16, 11, 11, 11, 11, 11, 11};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            //quickSort(arr, 0, index - 1); 之前的版本，这种姿势有很大的性能问题，谢谢大家的建议
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }

    }

    private static int getIndex(int[] arr, int left, int right) {
        int i = left, j = right;
        int tmp = arr[left];
        while (i < j) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (i < j && arr[j] >= tmp) {
                j--;
            }
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (i < j && arr[i] <= tmp) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                int z;
                //z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
                z = arr[i];
                arr[i] = arr[j];
                //左右哨兵 交换数据（互相持有对方的数据）
                arr[j] = z;
            }

        }
        arr[left] = arr[i];
        arr[i] = tmp;
        return i; // 返回tmp的正确位置
    }
}
