package com.company.demo1_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zsw
 * @date 2020/12/30 14:04
 */

public class MyPredicateImplPrice implements MyPredicate{
    private static final Double PRICE = 56.00;
    /*这样实现的话可能有人会说，每次变更需求都需要新建一个实现类，感觉还是有点繁琐呀，那么再来优化一下*/
    @Override
    public ArrayList<Product> filterProduct(ArrayList<Product> productList) {
        List<Product> list = productList.stream().filter(product -> product.getPrice()>PRICE).collect(Collectors.toList());
        return (ArrayList<Product>) list;
    }
}
