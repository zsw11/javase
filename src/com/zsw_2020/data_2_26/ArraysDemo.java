package com.zsw_2020.data_2_26;
import java.util.*;

/**
 * Arrays类里的static方法
 */
public class ArraysDemo {
    /**
     * 数组排序sort
     */
    public static void sortDemo(){
        String[] s =new String[]{"China","English","France","America"};
        for(String s1:s){
            System.out.print(s1+" ");
        }
        Arrays.sort(s);
        for(String s1:s){
            System.out.print(s1+" ");
        }
    }

    /**
     * binarySearch快速查找指定元素
     * @param
     */
    public static void binarySearchDemo(){
        int[] a = new int[]{1,2,5,4,3};
        Arrays.sort(a);
        int i=Arrays.binarySearch(a,3);
        int i1=Arrays.binarySearch(a,6);//查找的数不在，则返回-插入点-1
        System.out.println(i+";"+i1);
    }

    /**
     * 数组的比较
     * @param
     */
    public static void EqualsDemo(){
        int[] a1= new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1,47);
        Arrays.fill(a2,47);//用47填充数组a1，a2的每一个元素
        System.out.println(Arrays.equals(a1, a2));//true
        System.out.println(a1.equals(a2));//false
        a2[9] = 11;
        System.out.println(Arrays.equals(a1,a2));
        String[] s1= new String[4];
        Arrays.fill(s1,"ztyj");
        String[] s2= new String[]{"ztyj","ztyj","ztyj","ztyj"};
        System.out.println(Arrays.equals(s1,s2));
    }

    /**
     * copyOf copyOfRange 数组元素的复制
     */
    public static void copyDemo(){
        int[] numbers ={1,23,45};
        int[] newArrays = Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(newArrays));
        int[] rang= Arrays.copyOfRange(numbers,1,5);
        System.out.println(Arrays.toString(rang));
        int[] a={1,23,4,5,6,8};
        a= Arrays.copyOfRange(a,0,3);
        System.out.println(Arrays.toString(a));
        /*结果
        [1, 23, 45, 0]
        [23, 45, 0, 0]
        [1, 23, 4]
         */
    }

    /**
     * asList和Collection里的toArray（）
     * @param
     */
    public static void ListDemo(){
        String[] str = {"one","zse","zsw","ztyj"};
        List<String> list= Arrays.asList(str);//将数组转化为线性表
//        List<String> list1= Arrays.asList("one","zse","zsw","ztyj");
//        list.add("er");// java.lang.UnsupportedOperationException, Arrays.asList返回的list对象是不可变的，看源码
        System.out.println(list);
    }
    public static void main(String[] args) {
//        sortDemo();
//        binarySearchDemo();
//        EqualsDemo();
//        copyDemo();
        ListDemo();
    }
}
