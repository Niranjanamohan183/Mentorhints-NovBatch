package com.week1.flowControl;

public class Pattern {

	int n = 5;
	public static void main(String[] args) {
		for(int i=1; i<=n; i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
