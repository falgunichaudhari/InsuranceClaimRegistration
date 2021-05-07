package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="answers")
public class Answer {
	
	@Id
	@Column(name = "answer")
	private String answer;

	
	public Answer() {
		super();
	}

	public Answer(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "\nAnswer [answer=" + answer + "]";
	}
	
	
}