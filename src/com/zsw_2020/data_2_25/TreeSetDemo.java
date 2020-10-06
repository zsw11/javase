package com.zsw_2020.data_2_25;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        String[] str  =new String[]{"ane","bhie","cdr","der"};
        //TreeSet中的元素将自动排序
        Set<String> ts = new TreeSet<>(Arrays.asList(str));
        System.out.println(ts);//结果[ane, bhie, cdr, der]   按字母排序

    }
}
