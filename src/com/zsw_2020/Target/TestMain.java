package com.zsw_2020.Target;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zsw
 * @date 2021/4/19 11:15
 * @description : 测试 自定义注解
 */
@Slf4j
@HelloAnnotation(say = "do it")
public class TestMain {
    public static void main(String[] args) {
        // 导出运行时生成的代理对象
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        log.info("sss");
        // HelloAnnotation 为jdk生成的动态代理对象
        HelloAnnotation annotation = TestMain.class.getAnnotation(HelloAnnotation.class);//获取TestMain上的注解对象
        System.out.println(annotation.say());

    }
}
