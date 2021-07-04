package com.zsw_2020.jdk1_8;

/**
 * @author 54623
 * @date 2020/12/28 22:54
 */
// 定义一个泛型接口
public interface MyPredicate<T> {
    boolean test(T t);
}
