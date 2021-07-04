//package com.bianchensixiang.collection;
//
//import net.mindview.util.*;
//
//import javax.annotation.Generated;
//import java.util.Arrays;
//
///**
// * @author zsw
// * @date 2021/1/25 16:51
// * @description : java 编程思想源码
// */
//public class AlphabeticSearch {
//    public static void main(String[] args) {
//        String[] sa = Generated.array(new String[30], new RandomGenerator.String(5));
//        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
//        System.out.println(Arrays.toString(sa));
//        int index = Arrays.binarySearch(sa, sa[10],
//                String.CASE_INSENSITIVE_ORDER);
//        System.out.println("Index: "+ index + "\n"+ sa[index]);
//
//    }
//}
