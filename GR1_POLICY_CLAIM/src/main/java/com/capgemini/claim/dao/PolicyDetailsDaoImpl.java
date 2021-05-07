package com.capgemini.claim.dao;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;

public class PolicyDetailsDaoImpl implements PolicyDetailsDao{
	private EntityManager em;
	public PolicyDetailsDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
}
