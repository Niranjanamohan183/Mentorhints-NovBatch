package com.week1.doubt;

public class PyramidPattern {
	public static void main(String[] args ) {
		int n = 10;                  //number rows
		for(int i=1;i<=n; i++) {  
			int spaces = n-i;    //leading spaces
			int stars = 2*i-1;   //odd numbers of stars 1,2,3,5,7,9...
			
			for(int s=0; s<spaces; s++) {   //printing spaces
				System.out.print(" ");
			}
			
			for(int k=0; k<stars; k++) {  //printing stars
				System.out.print("*");
			}
			System.out.println();  //next line
		}
	}

}
