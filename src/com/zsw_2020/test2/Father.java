package com.zsw_2020.test2;

public class Father {
	
	public String str = "父类变量";
	
	public String strOnly = "父类变量,子类没有同名变量";
	
	public void printf(String str){
		System.out.println(str+"这是父类的方法");
	}
	
	public void printfOnly(String str){
		System.out.println("这是父类的方法,子类没有重写的方法====>"+str);
	}
}