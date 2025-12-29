package com.week5.Mulithreading;

class Mythread extends Thread { 
	
    private String threadName;    
    Mythread(String name) {    
        threadName = name;    
    }    
    public void run() {    
        for (int i = 1; i <= 5; i++) {    
            System.out.println(threadName + " - Count: " + i);    
            try {    
               
                Thread.sleep(5000);    
            } catch (InterruptedException e) {    
                System.out.println(threadName + " interrupted.");    
            }    
        }    
        System.out.println(threadName + " finished.");    
    }    
}    
