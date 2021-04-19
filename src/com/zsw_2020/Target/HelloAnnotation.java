package com.zsw_2020.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zsw
 * @date 2021/4/19 11:11
 * @description : 自定义注解
 * 注解本质是一个继承了Annotation的特殊接口，其具体实现类是Java运行时生成的动态代理类。
 * 通过代理对象调用自定义注解（接口）的方法，会最终调用AnnotationInvocationHandler的invoke方法。
 * 该方法会从memberValues这个Map中索引出对应的值。而memberValues的来源是Java常量池。
 *  @Retention（标明注解被保留的阶段）
 *  @Target（标明注解使用的范围）
 *  @Inherited（标明注解可继承）、@Documented（标明是否生成javadoc文档）
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HelloAnnotation {

    String say() default "hi";

}
