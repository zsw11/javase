package com.zsw_2020.data_2_21;

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
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
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

    public static void main(String[] args) {
        int sorce[] = {34, 54, 23, 12, 34, 55};
//        selectionSort(sorce);
        maoSort(sorce);
        for (int i : sorce) {
            System.out.println(i);
        }
    }
}
