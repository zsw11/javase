package com.company.jvm;

/**
 * @author zsw
 * @date 2021/4/7 17:20
 * @description :
 */
public class demo {
    public static void main(String[] args) {
        //返回jvm试图使用的最大内存
        long maxMemory = Runtime.getRuntime().maxMemory(); //字节
        // 返回jvm初始化的总内存
        long totalMemory = Runtime.getRuntime().totalMemory();
       // 本机 12G约等于 maxMemory的4倍 totalMemory的64倍
        System.out.println("maxMemory:"+(double)maxMemory/1024/1204+"MB"); // 2315MB
        System.out.println("totalMemory:"+(double)totalMemory/1024/1204+"MB");  //156MB
        // OOM  -Xms1024m -Xmx1024m -XX:+PrintGCDetails
    }
}
