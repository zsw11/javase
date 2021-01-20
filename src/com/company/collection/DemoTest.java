package com.company.collection;

import java.math.BigDecimal;

/**
 * @author zsw
 * @date 2021/1/4 10:23
 */
public class DemoTest {
    public static void main(String[] args) {
//        Generic<String> stringGeneric = new Generic<>();
//        stringGeneric.setT("我是一个泛型类");
//        System.out.println(stringGeneric.getT().toString());
//
//        Generic<Integer> integerGeneric = new Generic<>();
//        integerGeneric.setT(888);
//        System.out.println(integerGeneric.getT());
//
//        Generic<Student> stuG = new Generic<>();
//        stuG.setT(new Student("张三", 90));
//        System.out.println(stuG.getT().toString());

        GeericF geericF = new GeericF();
        geericF.show("String");//调用泛型方法
        geericF.show(4);//调用泛型方法
        geericF.show(new Student("zsw",24));//调用泛型方法

        GenericTImpl<Object> objectGenericT = new GenericTImpl<>();
        objectGenericT.show("我是泛型接口");

        GenericTImpl<Object> objectGenericT1 = new GenericTImpl<>();
        objectGenericT1.show(1234);

        GenericT<Object> genericT =new GenericTImpl<>();
        genericT.show("多态");

//        GenericT<Float> floatGenericT = aFloat -> System.out.println("浮点数：" + aFloat);
//        floatGenericT.show(3.1415926888f);//float 只能保证十进制的 7 位有效数字的精度，虽然有时候会显示多出变成 8 位，但是多出的一位的精度无法保证是正确的。

        GenericT<BigDecimal> bigDecimalGenericT = bigDecimal -> System.out.println("big:"+bigDecimal);
        bigDecimalGenericT.show(BigDecimal.valueOf(3.14159267));
        bigDecimalGenericT.show(new BigDecimal("3.14159267"));
        Integer integer = Integer.valueOf("25");
        int x =Integer.parseInt("9");
    }
}
