package com.zsw_2020.test2;

import java.util.SortedMap;

public class Test01 {
    public static void main(String[] args) {
        int[] arr={3,7,10,35,49,55,67,89,90,101};
        int num=101;
        int gui = DiGui(arr, num, arr.length - 1, 0);
        System.out.println(gui);
//        System.out.println(s(arr,num));
    }
    public static int s(int[] a,int n){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(a[middle]==n){
                System.out.println(a[middle]);
                return middle;
            }else if(a[middle]>n){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        return -1;
    }

    public static int  DiGui(int arr[],int key,int max,int min){
        int mid = (max + min )/2;
        if(key < arr[mid]){
            max = mid-1;
           return DiGui(arr,key,max,min );
        }else if(key > arr[mid]){
            min = mid +1;
         return  DiGui(arr,key,max,min);
        }else if (key == arr[mid]){
            return mid;
        }
        return -1;
    }
}
