package com.week4.exception;

import java.util.Scanner;

public class MatrixAddition {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows =3, cols = 3;
		
		int[][] A = new int[rows][cols];
		int[][] B = new int[rows][cols];
		
		System.out.println("Enter the elements of Matrix A in 3X3");
		readMatrix(sc,A);
		
		System.out.println("Enter the elements of Matrix B in 3X3");
		readMatrix(sc,B);
		
		int[][] c = addMatrix(A,B);
		
		System.out.println("Result = ");
		printMatix(c);
		
		sc.close();
	}
	
	
	private static void readMatrix(Scanner sc, int[][] M) {
		for(int i=0; i<M.length; i++) {
			for(int j = 0 ; j<M[0].length; j++) {
				M[i][j] = sc.nextInt();
			}
		}
	}
	
	private static int[][] addMatrix(int[][] A, int[][] B){
		int rows = A.length, cols = A[0].length;
		if(rows != B.length || cols != B[0].length) {
			throw new IllegalArgumentException("Matrices must have same dimensions");
		}
		int[][] c = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				c[i][j] = A[i][j] + B[i][j];
			}
		}
		return c;
	}
	
	private static void printMatix(int[][] M) {
		for(int[] row: M) {
			for(int val : row) {
				System.out.printf("%4d", val);
			}
			System.out.println();
		}
	}

}
