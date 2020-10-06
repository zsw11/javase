package com.zsw_2020.data_2_20;

import com.zsw_2020.test1.ThreadDemo;

import java.util.Arrays;

/**
 * 数组的复制
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,8};
        int[]a1 = {12,11,10,9,8,7,6,5,4,3,2,1};
        int[]a2= {8,7,6,5,4};
        try{
            System.arraycopy(a,0,a1,0,a.length);//System里的复制方法，Array类也有copyOf（），copyOfRange（）方法
            System.arraycopy(a,0,a2,0,a.length);//运行时异常
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for(int ele:a1){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i :a2){
            System.out.print(i+" ");
        }
        System.out.print(Arrays.toString(ThreadDemo.reverse(a)));//数组反转
    }


}
