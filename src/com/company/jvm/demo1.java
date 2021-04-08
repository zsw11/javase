package com.company.jvm;

import java.util.ArrayList;

/**
 * @author zsw
 * @date 2021/4/7 17:48
 * @description :
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<demo> strings = new ArrayList<>();
//        -Xms4m -Xmx4m -XX:+PrintGCDetails
        while (true) {
            strings.add(new demo());
        }
    }
}
