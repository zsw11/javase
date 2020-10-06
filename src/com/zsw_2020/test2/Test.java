package com.zsw_2020.test2;

import java.util.Scanner;

public class Test {
    // full为可以换的瓶数
    static int full = 0;
    public static void calc(int n) {
        if(n<5){
            System.out.println("你钱不够买一瓶");
        }else{
            int i=n/5;
            if(i<3){
                System.out.println("总共可以喝："+i+"瓶");
            }else{
                int b =i+change(i);
                System.out.println("总共可以喝："+b+"瓶");
            }
        }
    }
    public static int change(int empty) {
        // empty为空瓶子
        full=full+empty/3; // 空瓶子换的瓶数
        empty =empty/3+empty%3;  // 现有空瓶子数
        if(empty>=3){
            return change(empty);
        }else {
            return full;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入几元：");
        int n = scanner.nextInt();
        calc(n);
    }
}
