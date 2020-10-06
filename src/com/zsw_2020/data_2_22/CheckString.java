package com.zsw_2020.data_2_22;

import java.util.Scanner;

/**
 * 字符串常用方法   length() charAt() concat() subString()  replace()  toUpperCase() trim() isEmpty() indexof()
 * 手写回文方法，如mom,中国中
 */
public class CheckString {
    public static boolean isHuiWen(String str){
        int low =0;
        int heght= str.length()-1;
        while(low<heght){
            if(str.charAt(low)!=str.charAt(heght)){
                return false;
            }
            low++;
            heght--;
        }
        return true;
    }
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个字符串：");
            String s = scanner.nextLine();
            if(isHuiWen(s)){
                System.out.println(s+"是回文");
            }else{
                System.out.println(s+"不是回文");
            }
        }

    }
}
