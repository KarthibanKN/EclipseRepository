package org.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class numberDescending {
	public static void main(String[] args) throws InterruptedException {
		
		List<String> s=Arrays.asList("2500", "2000", "1500","1000", "500");
		for (String string : s) {
			System.out.println(string);
		}
		List<String> m= new ArrayList<String>();
		m.addAll(s);
		Thread.sleep(2000);
		System.out.println("After sorting...");
		Collections.reverse(m);
		Collections.reverse(m);
		for (String string : m) {
			System.out.println(string);
		}
		
	}
	
}
