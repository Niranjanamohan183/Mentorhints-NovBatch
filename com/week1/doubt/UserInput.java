package com.week1.doubt;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: " );
		int number = scanner.nextInt();
		
		//nextInt nextDouble
		
		//System.out.println("Enter your number: " );
		//String number = scanner.nextLine();
		
		
		System.out.println("Name: "+number);
		
		scanner.close();
	}

}
