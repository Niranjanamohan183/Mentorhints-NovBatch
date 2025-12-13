package com.week2.oops;

class Student {
	
	int roll;

	String name;
  
  	void takeLeave() {
    	System.out.println("on leave");
    }
  
  	void bunkClass() {
    	System.out.println("Go out and play: ");
    }
  	public Student()    //Constructor
  	{
  		roll = 23;
  	}
}

class Main {
	
  	public static void main(String args[]) {
    	
      	Student sid = new Student();
      	sid.bunkClass();
      	sid.name = "Siddhartha";
      	System.out.println(sid.name);
      	System.out.println(sid.roll);
    }
} 
