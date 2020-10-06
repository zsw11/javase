package com.zsw_2020.data_2_20;

/**
 * 数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = i*10;
        }
        for(int j=array.length-1;j>=0;j--){
            System.out.println(array[j]);
        }
        System.out.println(array.length);
//            System.out.println(array[10]);//java.lang.ArrayIndexOutOfBoundsException: 10
        ForDemo();
    }
    public static void ForDemo(){
        String[] seasons = {"Spring", "Summer", "Fail", "Winter"};
        for(String i:seasons){
            System.out.println(i);
        }
    }

}
