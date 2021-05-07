package com.capgemini.claim.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;
import com.capgemini.claim.bean.Question;

public class QuestionsDapImpl implements QuestionsDao{
	private EntityManager em;
	public QuestionsDapImpl()
	{
		em = JPAUtil.getEntityManager();
	}
	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return null;
	}
}
