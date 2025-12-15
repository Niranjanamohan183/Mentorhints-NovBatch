package com.week3.string;

//Im a student in mentorhints

public class LongestWord {
	
	static int LongestWordLength(String str) {
		int n = str.length();
		int x=0, y =0;
		
		for(int i=0; i<n; i++) {
			if(str.charAt(i) != ' ') {
				y++;  //current lenght
			}
			else {
				x = Math.max(x,y);
				y = 0;
			}
		}
		return Math.max(x, y);
	}
	public static void main(String[] args) {
		String str = "Im a student in mentorhints";
		System.out.println(LongestWordLength(str));
	}

}
