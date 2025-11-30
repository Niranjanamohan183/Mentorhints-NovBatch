package com.week1.javaBasics;

public class Operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 30;
		//int result, result2;
		
		// variable = exp1 ? exp2 : exp3
		//if exp1 is true exp2 will be executed
		//if exp1 is false exp3 will be executed
		
		//result = (a>b) ? a:b;
		
		//result2 = ((a>b) ? (a>c) ? a : c: (b>c) ? b:c);
		
		//System.out.println("Maximum of three "+result2);
		
		double value = 12.678f;
		float roundOff = Math.round(value);
		
		//System.out.println(roundOff);
		
		
		String result = String.format("%2.f", value);
		System.out.println(result);
		
		
	}
}
