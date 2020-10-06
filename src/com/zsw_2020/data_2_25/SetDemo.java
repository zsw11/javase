package com.zsw_2020.data_2_25;

import java.util.HashSet;
import java.util.Set;

/**
 * 用set对象实现集合运算
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);//并集
        System.out.println(union);
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);//交集
        System.out.println(intersection);
        Set<Integer> different = new HashSet<>(s1);
        different.removeAll(s2);//差集
        System.out.println(different);


    }
}
