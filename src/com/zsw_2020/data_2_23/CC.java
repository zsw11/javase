package com.zsw_2020.data_2_23;

interface A {
    int A=1;
    void displayA();
}
interface B{
    int B=2;
    void displayB();
}
public interface CC extends A,B{
    int C=3;
    void displayC();
}
