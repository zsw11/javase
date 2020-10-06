package com.zsw_2020.data_2_18;

public class Member {
    int instanceVar;
    static int classVar;
    void setInstanceVar(int i){
        instanceVar = i;
        classVar = i;//实例方法可以访问静态静态变量
    }
    int getInstanceVar(){
        return instanceVar;
    }
    static void setClassVar(int i){
        classVar = i;
//        instanceVar = i;//静态方法不能访问实例变量
    }
}
