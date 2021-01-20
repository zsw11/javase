package com.company.demo1_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zsw
 * @date 2020/12/30 13:56
 */
public class MypredicateImpl implements MyPredicate {
    private static final String HEI_SE = "heise";
    /**
     * 颜色过滤
     * @return
     */
    @Override
    public ArrayList<Product> filterProduct(ArrayList<Product> productList) {
        List<Product> list = productList.stream().filter(product -> product.getColor().equals(HEI_SE)).collect(Collectors.toList());
        return (ArrayList<Product>) list;
    }
}
