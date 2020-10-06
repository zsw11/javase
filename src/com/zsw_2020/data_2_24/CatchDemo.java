package com.zsw_2020.data_2_24;

/**
 * 用catch捕获多个异常
 */
public class CatchDemo {
    public static void method(int sel){
        try{
            if(sel==0){
                System.out.println("无异常发生");
                return;
            }else if(sel==1){
                int i=0;
                System.out.println(4/i);
            }else if (sel==2){
                int[] array= new int[4];
                array[4] =10;
            }else if (sel==3){
                int[] array1= new int[4];
                array1[4] =11;
            }
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到："+e.toString());
        }catch (Exception e) {
            System.out.println("捕获到：" + e.toString());
        }finally {
            System.out.println("执行了Finally块："+sel);
        }

    }
    public static void main(String[] args) {
        method(0);
        method(1);
        method(2);
        method(3);
    }
}
