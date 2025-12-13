package com.week3.corejava;

class Student {
	
	int roll;
	double mark;
	String name;
	char grade = 'A';
	int age;
	
	public Student(int y, String s ) {
		roll = 21344;
		name = s;
		
	}
	
  	public static boolean age(int age) {
    	if(age < 18) 
    		return true;
    		//System.out.println("Access denied - you are not old enough");
    	else
    		return false;
    		//System.out.println("Access granted - you are old enough");
    }
  
  	public static void bunkClass() {
    	System.out.println("Go out and play: ");
    }
 
  	
  	public static void main(String args[]) {
  		//age();
  		age(27);
  		age(11);
    	
      	Student sid = new Student(12356,"Rahul");
      	
      	System.out.println(sid.name);
      	System.out.println(sid.roll);
      	System.out.println(sid.mark);
  	}
} 