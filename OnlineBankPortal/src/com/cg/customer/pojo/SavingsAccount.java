package com.cg.customer.pojo;
public abstract  class SavingsAccount extends BankAccount {
	private boolean salary;
	private String accountType;

	public SavingsAccount(Customer accountHolder, double accountBalance, boolean salary,String accountType) {
		super(accountHolder, accountBalance);
		this.salary = salary;
		this.accountType=accountType;
	}
	public SavingsAccount(Customer accountHolder, boolean salary,String accountType) {
		super(accountHolder);
		this.salary = salary;
		this.accountType=accountType;
	}

	public boolean isSalary() {
		return salary;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
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
		return "SavingsAccount [salary=" + salary + ", accountType=" + accountType + "]";
	}
	
	
}
