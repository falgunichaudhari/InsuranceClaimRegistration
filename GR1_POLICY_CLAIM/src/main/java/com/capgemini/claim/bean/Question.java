package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="Questions")
public class Question {

	@Column(name="Question")
	private String question;
	
	@Id
	@Column(name="QustId")
	private Long questionID;
	
	
	
	public Question() {
		super();
	}


	public Question(String question, Long questionID) {
		super();
		this.question = question;
		this.questionID = questionID;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public Long getQuestionID() {
		return questionID;
	}


	public void setQuestionID(Long questionID) {
		this.questionID = questionID;
	}


	@Override
	public String toString() {
		return "\nQuestion [question=" + question + ", questionID=" + questionID + "]";
	}
	
	
}
