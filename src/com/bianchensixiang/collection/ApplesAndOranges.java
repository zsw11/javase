package com.bianchensixiang.collection;

import java.util.ArrayList;

/**
 * @author zsw
 * @date 2021/1/25 16:11
 * @description : 泛型和类型安全的容器
 */
public class ApplesAndOranges {

    static class Apple{
        private static long count;
        private final long id = count ++;
        private long id(){return id;}
    }
    static class Orange{}

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
//        ArrayList apples = new ArrayList();
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
//            apples.add(new Orange());
        }
        for (int i = 0; i < apples.size(); i++) {
           ( (Apple) apples.get(i)).id();
        }
    }
}
