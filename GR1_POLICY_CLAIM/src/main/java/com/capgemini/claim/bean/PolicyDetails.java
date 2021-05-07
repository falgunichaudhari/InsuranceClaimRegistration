package com.capgemini.claim.bean;

import javax.persistence.*;


@Entity
@Table(name="policydetails")
public class PolicyDetails {
	
	@Id
	@Column(name="PolicyDetailId")
	private Double policyDetailId ;
	
	@Column(name="PolicyNumber")
	private Double policyNumber ;
	
	@Column(name="QuestionId")
	private Double questionId ;
	
	@Column(name="Answer")
	private String answer;
	
	
	
	public PolicyDetails() {
		super();
	}



	public PolicyDetails(Double policyDetailId, Double policyNumber, Double questionId, String answer) {
		super();
		this.policyDetailId = policyDetailId;
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
	}



	public Double getPolicyDetailId() {
		return policyDetailId;
	}



	public void setPolicyDetailId(Double policyDetailId) {
		this.policyDetailId = policyDetailId;
	}



	public Double getPolicyNumber() {
		return policyNumber;
	}



	public void setPolicyNumber(Double policyNumber) {
		this.policyNumber = policyNumber;
	}



	public Double getQuestionId() {
		return questionId;
	}



	public void setQuestionId(Double questionId) {
		this.questionId = questionId;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	@Override
	public String toString() {
		return "PolicyDetails [policyDetailId=" + policyDetailId + ", policyNumber=" + policyNumber + ", questionId="
				+ questionId + ", answer=" + answer + "]";
	}


	
	

}
