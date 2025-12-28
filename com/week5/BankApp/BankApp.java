package com.week5.BankApp;

public class BankApp {

	public static void main(String[] args) {
		
		BankService bank = new BankService();
		
		bank.creatAccount(1235478678, 5000);
		bank.deposit(1235478678, 1000);
		
		try {
			bank.withdraw(1235478678, 500);
		}catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
		
		bank.showBalance(1235478678);
	}

}
