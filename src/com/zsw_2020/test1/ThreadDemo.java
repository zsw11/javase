package com.zsw_2020.test1;

import java.util.Arrays;



public class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    public ThreadDemo() {
    }

    public void run() {
        for(int i=0; i<100;i++){
            System.out.println(this.getName()+"="+i);
        }
        try {
            Thread.sleep((long) (Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Thread r1 = new ThreadDemo("线程1");
//        Thread r2 = new ThreadDemo("线程2");
//        r1.start();
//        r2.start();
        //主线程
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+";"+thread);
        thread.setName("我是主线程");
        System.out.println(thread.getName()+":"+thread);
//        System.gc();  建议jvm进行垃圾回收，什么时候回收不知道
        int[] a = {2,3,4,5,6,6};
        System.out.println(Arrays.toString(reverse(a)));
        String s = new String("java");
        String s1= s.replace("j","a");
        System.out.println(s+":"+s1);//String对象的不可变性

    }

    /**
     * 实现数组反转，list和result
     * @param list
     * @return
     */
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[i] = list[j];
        }
        return result;
    }
}

