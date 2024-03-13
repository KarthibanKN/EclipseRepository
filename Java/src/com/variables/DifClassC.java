package com.variables;

public class DifClassC {
	
	//Without static
	
		//2.Access instance variable into non static method - Object
		/*
		public static void main(String[] args) {
			DifClassA a = new DifClassA();
			a.m1();
		}
		*/
	
		//4.Access Non static into non static method - Object
		/*
		private void m2() {
			DifClassA a = new DifClassA();
			a.m1();
		}
		public static void main(String[] args) {
			DifClassC c = new DifClassC();
			c.m2();
		}
		*/
	
		//2.Access static into non static method - classname.methodname
		/*
		private void m2() {
			DifClassA.m1();
		}
		public static void main(String[] args) {
			DifClassC c = new DifClassC();
			c.m2();
		}
		*/
	
	    //4.Access static into non static method - classname.methodname
		/*
		public static void m2() {
			DifClassA.m1();
		}
		public static void main(String[] args) {
			m2();
		}
		*/
		
		//6.Access static variable into non static method - className.varible name
		/*
		private void m1() {
			System.out.println(DifClassA.id);
		}
		public static void main(String[] args) {
			DifClassC c = new DifClassC();
			c.m1();
		}
		*/
	
		//8.Access static variable into static method - className.varible name
	
		private static void m1() {
			System.out.println(DifClassA.id);
		}
		public static void main(String[] args) {
			m1();
		}
				
		
		
}
