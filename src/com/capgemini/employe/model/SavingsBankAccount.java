package com.capgemini.employe.model;

import com.capgemini.employe.exception.LowBalanceException;

public class SavingsBankAccount extends BankAccount {

	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 10000;
	
	
	public SavingsBankAccount () {
		super();
	}

	public SavingsBankAccount(long accountId, String accountHolderName,  double accountBalance,boolean salaryAccount) {
		super(accountId, accountHolderName, "Savings", accountBalance);
		this.salaryAccount = salaryAccount;
		
	}

	public boolean isSalaryAccount(boolean salaryAccount) {
		return true;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	@Override
	public double withdraw(double amount) throws LowBalanceException {
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				throw new LowBalanceException("You dont have sufficient balance");
			return getAccountBalance();
		}
	}

	
}
