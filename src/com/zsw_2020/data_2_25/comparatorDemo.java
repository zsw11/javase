package com.zsw_2020.data_2_25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 比较器comparator
 */
public class comparatorDemo {
    //DescSort成员内部类
    private static class DescSort implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }

    public static void main(String[] args) {
        String[] str  =new String[]{"ane","bhie","cdr","der"};
        //TreeSet中的元素将自动排序
        Set<String> ts = new TreeSet<>(Arrays.asList(str));
        System.out.println(ts);//首先String类自然排序（按字母）
        Comparator<String> comparator = new DescSort();//new一个比较器
        ts = new TreeSet<>(comparator);//传入比较器
        ts.addAll(Arrays.asList(str));
        System.out.println(ts);//使用比较器排的序
    }
}
