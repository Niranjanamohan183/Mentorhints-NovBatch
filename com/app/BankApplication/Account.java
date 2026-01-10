package com.app.BankApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

	private  int accountNumber;  //Need to add final
	private String holderName;
	private BigDecimal balance;
	private final List<Transaction> transactions = new ArrayList<>();
	
	public Account(int accountNumber, String holderName, BigDecimal openingBalance) {
		if(openingBalance == null || openingBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Opening balance canot be negative or null");
		}
		this.accountNumber = accountNumber;
		this.holderName = holderName == null ? "unknown" : holderName;
		this.balance = openingBalance;
		//this.transactions.add(Transaction(LocalDateTime.now(), TransactionType.OPEN, openingBalance, balance, "Account Opened"));
		
		
	}
	

}
