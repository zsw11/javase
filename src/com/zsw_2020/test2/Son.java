package com.zsw_2020.test2;

public class Son extends Father{
 
	public String str = "子类变量";
	
	
	public void printf(String str){
		
		System.out.println(str+"这是子类的方法");
	}
	
	public void test() {
		printf("什么都不使用=======>");
		this.printf("使用this=======>");
		super.printf("使用super=======>");
		printfOnly("子类没重写，就会调用父类的方法");
		this.printfOnly("子类没重写，就会调用父类的方法");
		
		System.out.println("str is ===========>"+str);
		System.out.println("super.str is ===========>"+super.str);
		System.out.println("子类没有同名变量，就会去找父类的变量 ===========>"+strOnly);
	}
	
	public static void main(String[] args) {
		 Son son = new Son();
		 son.test();	 
	}
	
}