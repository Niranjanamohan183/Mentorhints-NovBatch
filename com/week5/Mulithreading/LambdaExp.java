package com.week5.Mulithreading;

//
interface Add{
	int addition(int a, int b);
}

public class LambdaExp {
	public static void main(String[] args) {
		
		Add x = (a,b) -> a+b;
		
		int result = x.addition(18,2);
		
		System.out.println(result);
		
	}
	
	

}
