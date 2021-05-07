package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="claimdetails")
public class ClaimDetails {
	@Id
	@Column(name="ClaimNumber")
	private Double claimNumber ;
	
	@Column(name="ClaimReson")
	private String claimReson ;
	
	@Column(name="AccidentLocStreet")
	private String accidentLocStreet ;
	
	@Column(name="AccidentCity")
	private String accidentCity  ;
	
	@Column(name="AccidentState")
	private String accidentState  ;
	
	@Column(name="AccidentZip")
	private Long accidentZip  ;
	
	@Column(name="PolicyNumber")
	private Long PolicyNumber ;
	
	@Column(name="ClaimTypeId")
	private Long claimTypeId ;
	
	@Column(name="username")
	private String userName;
	
	
		
	public ClaimDetails() {
		super();
	}



	public ClaimDetails(Double claimNumber, String claimReson, String accidentLocStreet, String accidentCity,
			String accidentState, Long accidentZip, Long policyNumber, Long claimTypeId, String userName) {
		super();
		this.claimNumber = claimNumber;
		this.claimReson = claimReson;
		this.accidentLocStreet = accidentLocStreet;
		this.accidentCity = accidentCity;
		this.accidentState = accidentState;
		this.accidentZip = accidentZip;
		PolicyNumber = policyNumber;
		this.claimTypeId = claimTypeId;
		this.userName = userName;
	}



	public Double getClaimNumber() {
		return claimNumber;
	}



	public void setClaimNumber(Double claimNumber) {
		this.claimNumber = claimNumber;
	}



	public String getClaimReson() {
		return claimReson;
	}



	public void setClaimReson(String claimReson) {
		this.claimReson = claimReson;
	}



	public String getAccidentLocStreet() {
		return accidentLocStreet;
	}



	public void setAccidentLocStreet(String accidentLocStreet) {
		this.accidentLocStreet = accidentLocStreet;
	}



	public String getAccidentCity() {
		return accidentCity;
	}



	public void setAccidentCity(String accidentCity) {
		this.accidentCity = accidentCity;
	}



	public String getAccidentState() {
		return accidentState;
	}



	public void setAccidentState(String accidentState) {
		this.accidentState = accidentState;
	}



	public Long getAccidentZip() {
		return accidentZip;
	}



	public void setAccidentZip(Long accidentZip) {
		this.accidentZip = accidentZip;
	}



	public Long getPolicyNumber() {
		return PolicyNumber;
	}



	public void setPolicyNumber(Long policyNumber) {
		PolicyNumber = policyNumber;
	}



	public Long getClaimTypeId() {
		return claimTypeId;
	}



	public void setClaimTypeId(Long claimTypeId) {
		this.claimTypeId = claimTypeId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	@Override
	public String toString() {
		return "\nClaimDetails [claimNumber=" + claimNumber + ", claimReson=" + claimReson + ", accidentLocStreet="
				+ accidentLocStreet + ", accidentCity=" + accidentCity + ", accidentState=" + accidentState
				+ ", accidentZip=" + accidentZip + ", PolicyNumber=" + PolicyNumber + ", claimTypeId=" + claimTypeId
				+ ", userName=" + userName + "]";
	}


	
	
	
	
}
