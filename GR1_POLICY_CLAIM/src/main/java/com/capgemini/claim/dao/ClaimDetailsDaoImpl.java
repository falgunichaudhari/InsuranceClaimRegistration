package com.capgemini.claim.dao;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;
import com.capgemini.claim.bean.ClaimDetails;

public class ClaimDetailsDaoImpl implements ClaimDetailsDao{
	
	private EntityManager em;
	
	public ClaimDetailsDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
	
	@Override
	public ClaimDetails getClaimDetails(Double policyNumber) {

	
		
		ClaimDetails cd = em.find(ClaimDetails.class, policyNumber);
		return cd;
	}

	
}
