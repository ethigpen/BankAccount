package com.thigpen.bankAccount;
import java.util.Random;

public class BankAccount {
//	member variables
	private double checkingBalance;
	private double savingsBalance;
	private long acctNum;
	private static int numOfAccts = 0;
	private static int totalMoneyAcc = 0;
	
	Random randNum = new Random();
//	random bank account method
	private long setBankAcc() {
		long num = randNum.nextLong()/1000000000;
		while(num < 0){
		num = randNum.nextLong()/1000000000;	
		}
		long accNum = num;
		return accNum;
	}
	
//	constructor
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.acctNum = this.setBankAcc();
		numOfAccts++;
	}
	
//	methods
	
//	get
	public long getAcctNum() {
		return acctNum;
	}
	public double getCheckingBal() {
		return checkingBalance;
	}
	
	public double getSavingsBal() {
		return savingsBalance;
	}
	
	public static int getAccounts() {
		return numOfAccts;
	}
	
	public static int getTotalMoney() {
		return totalMoneyAcc;
	}
	
//	deposit
	public void deposit(int amtDeposit, String acct ) {
		if(acct == "checking") {
			this.checkingBalance += amtDeposit;
			totalMoneyAcc += amtDeposit;
		}else if (acct == "savings") {
			this.savingsBalance += amtDeposit;
			totalMoneyAcc += amtDeposit;
		}else {
			System.out.println("Please specify where to deposit your money ie checking or savings");
		}
	}
	
//	withdraw
	public void withdraw(int amtWithdraw, String acct ) {
		if(acct == "checking" && this.checkingBalance != 0) {
			this.checkingBalance -= amtWithdraw;
			totalMoneyAcc -= amtWithdraw;
		}else if (acct == "savings" && this.savingsBalance != 0) {
			this.savingsBalance -= amtWithdraw;
			totalMoneyAcc -= amtWithdraw;
		}else {
			System.out.println("Cannot complete transcation insufficent funds");
		}
	}
	
//	see total amount of user
	public String seeAmt() {
		double total = this.checkingBalance + this.savingsBalance;
		String amt = String.format("You currently have %.2f total monies", total);
		return amt;
	}

}
