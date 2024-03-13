package org.pgm;

import java.util.Scanner;

public class Programming {
	

	public static void main(String[] args) {
		int a[]= {100,30,50,20,10};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		System.out.println("*******");
		System.out.println(a[1]);
		System.out.println(a[a.length-2]);
		}

	
	/*
	public static void main(String[] args) {
		String s="abcdefg 123 hi%@ ABC";
		int smallCount=0;
		int capitalCount=0;
		int numberCount=0;
		int specialCount=0;
		for (int i = 0; i < s.length(); i++) {
			if ('a'<=s.charAt(i) && s.charAt(i)<='z') {
				smallCount++;
			} 
			else if ('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				capitalCount++;
			}
			else if ('0'<=s.charAt(i) && s.charAt(i)<='9') {
				numberCount++;
			}
			else {
				specialCount++;
			}
			}
		System.out.println("Small Letter Count:"+smallCount);
		System.out.println("Capital Letter Count:"+capitalCount);
		System.out.println("Number Count:"+numberCount);
		System.out.println("Special Character Count:"+specialCount);
	}
	*/
	/*
	public static void main(String[] args) {
		String s = "Welcome to java class";
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			reverse = c + reverse;
		}
		System.out.println(reverse);
		
	}
		*/
	
//		Scanner rn = new Scanner(System.in);
//		System.out.println("Enter a number"); 
//		int n = rn.nextInt();
//		int a, i = 0, j = 0;
//		a = n;
//		while (a > 0) {
//		i = a % 10;
//		j = (j * 10) + i; 
//		a = a / 10;
//		}
//		System.out.println("Reverse number is=" + j);
//		}
//		
		
		
	
}
	


