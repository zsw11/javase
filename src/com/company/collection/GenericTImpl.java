package com.company.collection;

/**
 * @author zsw
 * @date 2021/1/4 10:54
 * 泛型接口
 */
public class GenericTImpl<T> implements GenericT<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
