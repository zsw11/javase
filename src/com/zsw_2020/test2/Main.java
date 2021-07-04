package com.zsw_2020.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        BlockThread blockThread = new BlockThread();
        for(int i=0;i<5;i++){
            int finalI = i;
            executorService.submit(()->blockThread.tryFunction(finalI));
        }
    }

    static class  BlockThread{
        private volatile int count =0;
        synchronized void tryFunction(int tag){
            int cur = 0;
            for(;cur<10;cur++){
                count++;
                if(0 == count%2){
                    System.out.println(String.format("Thread %d get slice count:%d,cur:%d",tag,count,cur));

                }

            }
        }

    }
}
