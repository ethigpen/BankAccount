package com.thigpen.bankAccount;

public class BankAccountTest {
	
	public static void main(String [] args) {
		BankAccount person1 = new BankAccount();
		BankAccount person2 = new BankAccount();
		
		person1.deposit(250, "checking");
		person2.deposit(500, "checking");
		person1.withdraw(50, "savings");
		System.out.println(person1.seeAmt());
		System.out.println(person2.seeAmt());
		System.out.println(BankAccount.getTotalMoney());
		System.out.println(BankAccount.getAccounts());
	}

}
