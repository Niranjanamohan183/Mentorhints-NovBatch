package com.week3.string;

//Chennai is a metro city
//Madurai is a temple city :  index = 8, ch=t

public class Substring {
	
	public static void main(String[] args) {
		String str = "Madurai is a temple city";
		
		int index = 8; 
		
		char ch = 't';
		
		System.out.println(str);
		
		str = str.substring(0, index) + ch + str.substring(index+1); //7
		
		System.out.println(str);
		
	}

}
