package com.company.util;

/**
 * @author zsw
 * @date 2021/1/12 11:19
 * @description : quanju变量测试
 */
public class quanJu {
    private static int page;

    public static void changNum(int num){
        page= num;
    }

    public static void changNum2(int num){
        page= num;
    }

    public static void main(String[] args) {

        // 多线程
        Runnable runnable = () -> {
            for(int i=0;i<10;i++){
                quanJu.changNum(i);
                System.out.println("0~9:"+quanJu.page);
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i=10;i<20;i++){
                    quanJu.changNum2(i);
                    System.out.println("10~19:"+quanJu.page);
                }
            }
        };

        for(int i=0;i<10;i++){
            new Thread(runnable).start();
            new Thread(runnable1).start();
        }
    }

}
