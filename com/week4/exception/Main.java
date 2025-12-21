package com.week4.exception;

public class Main {
	
	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[10]);  //ArrayIndexoutof bound
			int result = 10/78687;      //arithmetic 
			System.out.println(result);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			System.out.println("Array index does not exist");
		}
		catch(ArithmeticException e ) {
			//System.out.println(e);
			System.out.println("can");
		}
		finally {
			System.out.println("This block always runs");
			int result = 10/78687;
			System.out.println(result);
			System.out.println("This block always runs");
			System.out.println("This block always runs");
			System.out.println("This block always runs");
		}
		
	}

}
