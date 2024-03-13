package com.variables;

public class DifClassA {
	
	//Without static
	
	//1.Access instance variable into non static method - Extends 
	/*
	int id = 10;
	*/
	
	//2.Access instance variable into non static method - Object 
	/*
	int id = 10;
	void m1() {
		System.out.println(id);
	}
	*/
	
	//3.Access Non static into non static method - Extends
	/*
	public void m1() {
		System.out.println("Non static method accessed by non static method using extends");
	}
	*/
	
	//4.Access Non static into non static method - Object
	/*
	public void m1() {
		System.out.println("Non static method accessed by non static method using object");
	}
	*/
	
	//With Static
	
	//1.Access static into non static method - Extends
	/*
	public static void m1() {
		System.out.println("static into non static using extends ");
	}
	*/
	
	//2.Access static into non static method - classname.methodname
	/*
	public static void m1() {
		System.out.println("static into non static using classname.methodname");
	}
	*/
	
	//3.Access static into non static method - Extends
	/*
	public static void m1() {
		System.out.println("static into static using extends");
	}
	*/
	
	//4.Access static into non static method - classname.methodname
	/*
	public static void m1() {
		System.out.println("static into static using classname.methodname");
	}
	*/
	
	//5.Access static variable into non static method - Extends
	//static int id = 10;
	
	//6.Access static variable into non static method - className.varible name
	//static int id = 100;
	
	//7.Access static variable into static method - Extends
	//static int id = 10;
		
	//8.Access static variable into static method - className.varible name
	static int id = 100;
	
}
