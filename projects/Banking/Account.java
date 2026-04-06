package com.projects.Banking;

 class Account {

	private long acNo;
	private String acHolderName;
	private double balance;

	public long getAcNo() {
		return acNo;
	}

	public String getAcHolderName() {
		return acHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}

	public void setAcHolderName(String AcHolderName) {
		this.acHolderName = AcHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void display() {
		System.out.println("Account No : " + acNo);
		System.out.println("Account Holder Name: " + acHolderName);
		System.out.println("Account Balance : " + balance);
	}

}

