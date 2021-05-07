package com.capgemini.claim.dao;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;
import com.capgemini.claim.bean.Policy;

public class PolicyDaoImpl implements PolicyDao{
	private EntityManager em;
	public PolicyDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
	
	@Override
	public Policy createPolicy(Policy p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		return p;
	}
}
