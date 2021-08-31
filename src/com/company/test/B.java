package com.company.test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author zsw
 * @date 2021/8/18 13:50
 */
public class B {

    public void testB() {
        A a = new A();
//        A.a a1 = a.new a();
        A.a aName = new A.a();
//        Optional.of(new A.a()).orElse()
        A.builder().AName("AName").a(aName);

    }
}
