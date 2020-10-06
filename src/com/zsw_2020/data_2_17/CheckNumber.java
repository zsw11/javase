package com.zsw_2020.data_2_17;

import java.util.Scanner;
/**
 * 程序流程控制
 */
public class CheckNumber {
    public static void main(String[] args) {
//        test1();
//       LeapYear();
//       ScoreGrade();
        SwitchDemo();

    }
        static void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        if(num%5==0 && num %6==0){
            System.out.println(num+"能被5和6同时整除");
        }
       if(num%5==0 || num%6==0){
           System.out.println(num+"能被5或者6整除");
       }
       if(num%5==0 ^ num%6==0){
           System.out.println(num+"只能被5或者只能被6整除");
       }
    }

    static void LeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年");
        }else{
            System.out.println(year+"年不是闰年");
        }
    }

    static void ScoreGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
        String grade = "成绩";
        if(score>100 || score<0){
            System.out.println("你输入的成绩不正确");
        }else if (score<100&&score>80){
            grade="优秀";
        }else if(score<80&&score>60){
            grade="还行吧";
        }else if(score<60){
            grade="你好垃圾";
        }
        System.out.println("你的成绩："+grade);
    }

    static void SwitchDemo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("亲输入一个月份：");
        int month = scanner.nextInt();
        int numDay = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDay=30;
                break;
            case 2:
               if((year%4==0 && year%100!=0) || year%400==0){
                   numDay = 29;
               }else {
                   numDay = 28;
               }
               break;
            default:
                System.out.println("你输入的时间不合法，重新输入");
                SwitchDemo();
        }
        System.out.println("该月为"+numDay+"天");
        SwitchDemo();
    }
}
