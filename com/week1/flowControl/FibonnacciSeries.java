package com.week1.flowControl;

public class FibonnacciSeries {
	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13 - Fibonacci Series
		int n = 10;   //First number of series
		int x=0, y=1;
		System.out.print("Fibonacci Series " +x+ "," +y);
		
		for(int i=2; i<n; i++) {   //i=3
			int sum = x+y;       //sum = 2
			System.out.print(", "+sum);
			x=y;             //x= 1 y= 2
			y=sum;
		}
	}

}
