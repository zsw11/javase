package com.zsw_2020.data_2_23;

/**
 * final修饰符
 */
class AA{
    public static final int ZSW=24;
    public void displayA(final int i){
//        i= i+1;//该语句会产生编译错误，不能改变i所指向的地址
        System.out.println(ZSW);
    }
    public int displayB(final int i){
        int y = i+1;//该语句没有错误，可以使用i的值
        return y;
    }
}
public class FinalTest {
    public static void main(String[] args) {
       AA aa = new AA();
       aa.displayA(5);
       int a = aa.displayB(5);
       System.out.println(a);

    }
}
