package com.zsw_2020.data_2_19;

/**
 * Math类是final，不能被继承，构造方法是private不能被实例化
 * round()四舍五入  rint(x)返回与x相邻的整数，如果x到两个整数的距离相等，返回其中的偶数
 */
public class MathDemo {
    public static char getLetter(){
        return (char) ('a'+Math.random()*('z'-'a'+1));//返回a到z-a之间的随机数
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.print(getLetter()+" ");
            if(i%20==0){//每输出20个字母进行换行
                System.out.println();
            }
        }

    }
}
