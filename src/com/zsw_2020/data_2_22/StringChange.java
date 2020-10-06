package com.zsw_2020.data_2_22;

import java.util.Arrays;

public class StringChange {
    public static void main(String[] args) {
        String s = new String("This is a java String");
        char[] chars = s.toCharArray();//字符串转化为字符数组
        System.out.println(chars);
        char [] subs = new char[4];
        int[] a = new int[]{1,23,4};
        s.getChars(10,14,subs,0);//把字符串的一部分复制到字符数组中
        System.out.println(subs);
        System.out.println(Arrays.toString(a));
    }
}
