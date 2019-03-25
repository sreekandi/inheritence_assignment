package com.capgemini.employe.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employe.exception.LowBalanceException;
import com.capgemini.employe.model.CurrentBankAccount;



public class CurrentBankAccountTest {
	CurrentBankAccount currentAccount;

	@Before
	public void setUp() {
		currentAccount = new CurrentBankAccount(101, "vidhya", 24000, 20000);
	}

	@Test
	public void tesBankAccountIsCreatedWithDefaultConstructor() {
		CurrentBankAccount currentAccount = new CurrentBankAccount();
		assertNotNull(currentAccount);
	}

	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, currentAccount.getAccountId());
		assertEquals("vidhya", currentAccount.getAccountHolderName());
		assertEquals(24000.0, currentAccount.getAccountBalance(), 0.01);
		assertEquals(20000, currentAccount.getDebitLimit(), 0.01);

	}
	@Test
	public void testWithdrawAmountWithCurrentBalance() throws LowBalanceException {
		currentAccount.withdraw(24000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testWithdrawAmountWithoutExtendingDebitLimt() throws LowBalanceException {
		currentAccount.withdraw(34000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawAmountWithExtendingDebitLimt() throws LowBalanceException {
		currentAccount.withdraw(55000);
		
	}
	@Test
	public void testDepositAmountWithBorrowedAmountGreaterThanZero() throws LowBalanceException {
		currentAccount.withdraw(20000);
		currentAccount.deposit(25000);
		assertEquals(29000, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDepositAmountWithBorrowedAmountEqualToZero() throws LowBalanceException {
		currentAccount.withdraw(24000);
		currentAccount.deposit(25000);
		assertEquals(25000, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testDepositAmountWithBorrowedAmountLessThanZero() throws LowBalanceException {
		currentAccount.withdraw(34000);
		currentAccount.deposit(25000);
		assertEquals(15000, currentAccount.getAccountBalance(),0.01);
	}

}
