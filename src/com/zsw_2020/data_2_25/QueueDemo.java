package com.zsw_2020.data_2_25;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列，先进先出，实现类LinkList和PriorityQueue,
 * PriorityQueue里的元素可以根据比较器排序，但还是先进先出
 */
public class QueueDemo {
    public static void main(String[] args) throws InterruptedException {
        int time = Integer.parseInt("5");
        Queue<Integer> queue= new LinkedList<>();
        for(int i=time;i>=0;i--){
            queue.add(i);//入
        }
        while (!queue.isEmpty()){
            System.out.println(queue.remove());//出
            Thread.sleep(1000);//当前线程睡眠一秒钟
        }
    }
}

