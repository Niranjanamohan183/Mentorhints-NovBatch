package com.week1.flowControl;

public class NestedIf {
	public static void main(String[] args) {
		int age = 20;
		boolean isCitizen = true;
		
		if (age >= 18) {
			System.out.println("Old enough to vote!");  //
			
			if(isCitizen)
				System.out.println("And you are a citizen! Eligible to vote");
			else
				System.out.println("And you are not a citizen! Not Eligible to vote");
		}
		else {
			System.out.println("Not old enough cast a vote");
		}
	}

}
