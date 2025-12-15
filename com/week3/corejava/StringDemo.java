package com.week3.corejava;

public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello world!";
		String s2 = "Hello world!";
		String s3 = "HELLO WORLD!";
		
		String s = new String("Hello world!");
		
		System.out.println(s1 == s2);
		System.out.println(s == s2);
	}

}
