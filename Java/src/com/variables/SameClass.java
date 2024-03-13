package com.variables;

public class SameClass {

	//Without static
	//1.Access instance variable into Non static method - Direct
	/*
 	int id=10;
	private void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		SameClass s = new SameClass();
		s.m1();
	}
	*/
	
	//2.Access Non static into Non static method - Direct
	/*
	private void m1() {
		System.out.println("Non static method accessed by another non static method");
	}
	private void m2() {
		m1();
	}
	public static void main(String[] args) {
		SameClass s = new SameClass();
		s.m2();
	}
	*/
	
	//With static
	// 1.Access static variable into non static method - Direct
	/*
	static int id = 10;
	private void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		SameClass s = new SameClass();
		s.m1();
	}
	*/
	
	//2.Access static variable into static method - Direct
	/*
	static int id=10;
	private static void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		m1();
	}
	*/
	
	//3.Access static method into non static method - Direct
	/*
	private static void m1() {
		System.out.println("Static method accessed by Non static method");
	}
	private void m2() {
		m1();
	}
	public static void main(String[] args) {
		SameClass s = new SameClass();
		s.m2();
	}
	*/
	
	//4.Access static method into static method - Direct
	private static void m1() {
		System.out.println("Static method accessed by static method");
	}
	private static void m2() {
		m1();
	}
	public static void main(String[] args) {
		m2();
	}
	
	
	
}
