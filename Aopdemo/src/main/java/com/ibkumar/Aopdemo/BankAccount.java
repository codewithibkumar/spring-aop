package com.ibkumar.Aopdemo;

public class BankAccount {
	
	int balance= 10000;
	public void withdraw(int amount)
	{
		balance = balance - amount;
		System.out.println(amount + " debited");
	}
	public void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println(amount + " credited");
	}
	public int getBalance()
	{
		return balance;
	}
	public void miniStatement()
	{
		System.out.println("Mini Statement");
		System.out.println("27-06-2021 - 2000 Rs");
	}

}
