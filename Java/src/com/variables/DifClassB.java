package com.variables;

public class DifClassB extends DifClassA{
	
	//Without static
	
	//1.Access instance variable into non static method - Extends
	/*
	private void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		DifClassB b = new DifClassB();
		b.m1();
	}
	*/
	
	//3..Access Non static into non static method - Extends
	/*
	private void m2() {
		m1();
	}	
	public static void main(String[] args) {
		DifClassB b = new DifClassB();
		b.m2();
	}
	*/
	
	//With Static 
	
	//1.Access static into non static method - Extends
	/*
	private void m2() {
		m1();
	}
	public static void main(String[] args) {
		DifClassB b = new DifClassB();
		b.m2();
	}
	*/
	
	//3.Access static into non static method - Extends
	/*
	public static void m2() {
		m1();
	}
	public static void main(String[] args) {
		m2();
	}
	*/
	
	//5.Access static into non static method - Extends
	/*
	private void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		DifClassB b = new DifClassB();
		b.m1();
	}
	*/
	
	//7.Access static into static method - Extends
	/*
	private static void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		m1();
	}
	*/
	
	

}
