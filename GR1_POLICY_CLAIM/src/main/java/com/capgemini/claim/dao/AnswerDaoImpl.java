package com.capgemini.claim.dao;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;

public class AnswerDaoImpl implements AnswerDao{

	private EntityManager em;
	public AnswerDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
}
