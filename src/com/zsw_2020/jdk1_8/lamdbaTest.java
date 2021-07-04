package com.zsw_2020.jdk1_8;

import java.util.TreeSet;

public class lamdbaTest {
    private final char[] value;

    public lamdbaTest(char[] value) {
        this.value = value;
    }

    public void lamdba01(){
        // 匿名内部类
        Comparable<Integer> comparable = new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };

        Comparable<Integer> comparable1 = o -> 0;

        TreeSet<Integer> integers = new TreeSet<>();
        //lamdba
        Comparable<Integer> comparable2 = (x) -> 0;

    }


    public static void main(String[] args) {
        // todo

    }

}
