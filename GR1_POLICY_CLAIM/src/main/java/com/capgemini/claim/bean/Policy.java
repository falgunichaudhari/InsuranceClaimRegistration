package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="Policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Double policyNumber;
	
	@Column(name="PolicyPremium")
	private Double policyPremium;
	
	@Column(name="AccountNumber")
	private Long accountNumber;

	@Column(name="UserName")
	private String userName;
	
	
	
	public Policy() {
		super();
	}



	public Policy(Double policyPremium, Long accountNumber, String userName) {
		super();
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
		this.userName = userName;
	}



	public Double getPolicyNumber() {
		return policyNumber;
	}


	public Double getPolicyPremium() {
		return policyPremium;
	}



	public void setPolicyPremium(Double policyPremium) {
		this.policyPremium = policyPremium;
	}



	public Long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyPremium=" + policyPremium + ", accountNumber="
				+ accountNumber + ", userName=" + userName + "]";
	}


	

}
