package com.zsw_2020.data_2_21;

/**
 * 数组的查找
 */
public class Search {
    /**
     * 线性查找
     * @param arrays
     * @param key
     * @return
     */
    public static int lineSearch(int[] arrays, int key){
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]==key){
                return i;
            }
        }
        return -1;
    }
    /**
     * 二分查找
     * @param arrays
     * @param key
     * @return
     */
    public static int binarySearch(int[] arrays, int key){
        int low=0;
        int high = arrays.length-1;
        while (high>=low){
            int mid = (high+low)/2;
            if(key<arrays[mid]){
                high = mid-1;
            }else if(key==arrays[mid]){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] score = {12,33,45,67,45,89};
        int a = lineSearch(score,89);
        int b= binarySearch(score,89);
        System.out.println(a+";"+b);

    }
}
