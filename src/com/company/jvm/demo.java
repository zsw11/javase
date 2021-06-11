package com.company.jvm;

/**
 * @author zsw
 * @date 2021/4/7 17:20
 * @description :
 * arthas
 * 阿里巴巴开源 Java 诊断工具（开源地址：https://github.com/alibaba/arthas），基于 javaAgent 方式，使用 Instrumentation 方式修改字节码方式进行 Java 应用诊断。
 *
 * 基础功能介绍
 *
 * dashboard：系统实时数据面板, 可查看线程，内存，gc 等信息
 * thread：jvm 线程堆栈信息，如查看最繁忙的前 n 线程
 * getstatic：获取静态属性值，如 getstatic className attrName 可用于查看线上开关真实值
 * sc：查看 jvm 已加载类信息，可用于排查 jar 包冲突
 * sm：查看 jvm 已加载类的方法信息
 * jad：反编译 jvm 加载类信息,排查代码逻辑没执行原因
 * watch：观测方法执行数据，包含出入参，异常等；
 *
 * watch xxxClass xxxMethod " {params, throwExp} " -e -x 2
 * watch xxxClass xxxMethod "{params,returnObj}" "params[0].sellerId.equals('189')" -x 2
 * watch xxxClass xxxMethod sendMsg '@com.taobao.eagleeye.EagleEye@getTraceId()'
 * trace：方法内部调用时长，并输出每个节点的耗时，用于性能分析
 * tt：用于记录方法，并做回放
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
