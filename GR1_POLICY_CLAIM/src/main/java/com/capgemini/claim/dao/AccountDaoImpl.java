package com.capgemini.claim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.capgemini.claim.JPAUtil.JPAUtil;
import com.capgemini.claim.bean.Account;
import com.capgemini.claim.bean.User;



public class AccountDaoImpl implements AccountDao{

	private EntityManager em;
	public AccountDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
	@Override
	public Account CreateAccountDetails(Account a) {
		
		em.getTransaction().begin();
		
		em.persist(a);
	    
		em.getTransaction().commit();
		
		return a;
	}

	@Override
	public Account getAccountDetails(String userName) {
		// TODO Auto-generated method stub
		String qStr = "SELECT a FROM Account a WHERE a.userName = :puserName";
		TypedQuery<Account> query = em.createQuery(qStr, Account.class);
		query.setParameter("puserName", userName);
		Account a = new Account();
		a = query.getSingleResult();
		System.out.println(a);
		return a;

	}
	
	
}
