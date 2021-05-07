package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="Account")
public class Account {


	@Column(name="UserName")
	private String userName;
	
	@Id
	@Column(name="AccountNumber")
	private Long accountNumber;
	
	
	public Account() {
		super();
	}


	public Account(String userName, Long accountNumber) {
		super();
		this.userName = userName;
		this.accountNumber = accountNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "\nAccount [userName=" + userName + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
