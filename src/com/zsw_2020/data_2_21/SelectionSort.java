package com.zsw_2020.data_2_21;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组排序，
 */
public class SelectionSort {
    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i; //最小元素的下标
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(array, min, i);
            }
        }
    }

    /**
     * 交换数组元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void maoSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {//-i表示有i个数已经排好序了，这些数不需要再排
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    /**
     * 插入排序
     *
     * @param array
     */
    public static void charupaixu(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序是我们之前学习的冒泡排序的升级，他们都属于交换类排序，都是采用不断的比较和移动来实现排序的
     * 首先找一个基点，第一次通过比较，把基点大的数放到右边，比基点小的数放到左边。
     * 以基点为界限，基点右边和左边重复上面操作
     *
     * @param args
     */
    public static void kuaipai() {

    }

    public static void main(String[] args) {
        int sorce[] = {34, 54, 23, 12, 34, 55};
        selectionSort(sorce);
//        maoSort(sorce);
//        charupaixu(sorce);
        for (int i : sorce) {
            System.out.println(i);
        }
    }
}
