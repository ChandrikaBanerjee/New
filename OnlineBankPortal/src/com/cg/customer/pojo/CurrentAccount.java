package com.cg.customer.pojo;

public abstract class CurrentAccount extends BankAccount {
	private double odLimit;
	private String accountType;

	public CurrentAccount(Customer accountHolder, double accountBalance, double odLimit,String accountType) {
		super(accountHolder, accountBalance);
		this.odLimit = odLimit;
		this.accountType=accountType;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	
	
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", accountType=" + accountType + "]";
	}

	
}
