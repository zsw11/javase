package com.company.demo1_8;

import java.util.ArrayList;

/**
 * @author zsw
 * @date 2020/12/30 13:53
 * 简单来说就是只定义了一个抽象方法的接口（Object类的public方法除外），就是函数式接口，并且还提供了注解：@FunctionalInterface
 */
@FunctionalInterface
public interface MyPredicate {
    ArrayList<Product> filterProduct(ArrayList<Product> productList);
//   boolean filterProduct1(Integer d);
}
