package com.company.demo1_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author zsw
 * @date 2020/12/30 10:45
 */
public class lamdba01 {
    private static ArrayList<Product> arrayList;

    static {
        arrayList = new ArrayList<>();
        ArrayList<Product> filterProducts = new ArrayList<>();
        arrayList.add(new Product(1,"手机","heise",36.00));
        arrayList.add(new Product(2,"手机2","hongse",34.00));
        arrayList.add(new Product(3,"手机3","huangse",35.00));
        arrayList.add(new Product(4,"手机4","zise",31.00));
        arrayList.add(new Product(5,"手机5","zongse",39.00));
    }

//    public static void main(String[] args) {
//        String a = null;
//        String a1=null;
//        String a2= "";
//        System.out.println(a+"-"+a1+"-"+a2);
//        ArrayList<Object> objects = new ArrayList<>();
//        System.out.println(objects);
//        objects =null;
//        System.out.println(objects);
//        arrayList.forEach(i->{   // java.util.ConcurrentModificationException, 并发修改异常
//            if (i.getId() > 2) {
//                arrayList.remove(i);
//            }
//            });
//    }

    public void lamdbatest01(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> integers = new TreeSet<>(comparator);
        System.out.println("================================");

        //使用lambda表达式
        Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set2 = new TreeSet<>(cpt2);
    }

    /**
     * 通过颜色帅选，一般写法
     * @return
     */
    public static List<Product>  filterProductByColor(){
        ArrayList<Product> filterProducts = new ArrayList<>();
        for(Product product : arrayList){
            if("heise".equals(product.getColor())){
                filterProducts.add(product);
            }
        }
        return filterProducts;
    }

    /**
     * 通过价格刷选
     * @param
     * @return
     */
//    @Test
    public static List<Product> filterProductByPrice(){
        List<Product> prods = new ArrayList<>();
        for (Product product : arrayList){
            if (product.getPrice() < 8000.00){
                prods.add(product);
            }
        }
        return prods;
    }

    /**
     * 通过匿名内部类和lamdba实现
     *  通过颜色过滤
     */
    public static MyPredicate filterByColor(){
//        MyPredicate heise = new MyPredicate() {
//            @Override
//            public ArrayList<Product> filterProduct(ArrayList<Product> productList) {
//                List<Product> products = productList.stream().filter(product -> product.getColor().equals("heise")).collect(Collectors.toList());
//                return (ArrayList<Product>) products;
//            }
//        };
        MyPredicate heise = productList1 -> {
//            List<Product> products = productList1.stream().filter(product -> product.getColor().equals("heise")).collect(Collectors.toList());
            List<Product> products2 = productList1.parallelStream().filter(product -> product.getColor().equals("heise")).collect(Collectors.toList());
            return (ArrayList<Product>) products2;
        };
        return heise;
    }


}
