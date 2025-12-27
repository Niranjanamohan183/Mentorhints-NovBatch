package com.week5.BankApp;

import java.util.HashMap;
import java.util.Map;

public class BankService {
	
	Map<Integer, Double> accounts = new HashMap();
	
	void creatAccount(int accNo, double balance) {
		accounts.put(accNo, balance);
		System.out.println("Account created Successfully");
	}
	
	void deposit(int accNo, double amount) {
		double bal = accounts.get(accNo);
		accounts.put(accNo, bal+amount);
		System.out.println("Deposit Successful");
	}
	
	void withdraw(int accNo, double amount) throws InsufficientBalanceException{
		double bal = accounts.get(accNo);
		if(amount>bal) {
			throw new InsufficientBalanceException("Insufficent Balance"); 
		}
		accounts.put(accNo, bal-amount);
		System.out.println("Withdrawl successful");
	}
	
	void showBalance(int accNo) {
		System.out.println("Current Balance: " + accounts.get(accNo));
	}

}
