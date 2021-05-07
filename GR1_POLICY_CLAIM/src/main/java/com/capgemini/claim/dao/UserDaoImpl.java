package com.capgemini.claim.dao;

import javax.persistence.EntityManager;

import com.capgemini.claim.JPAUtil.JPAUtil;
import com.capgemini.claim.bean.User;
import com.capgemini.customexception.CustomException;

public class UserDaoImpl  implements UserDao{

	private EntityManager em;
	public UserDaoImpl()
	{
		em = JPAUtil.getEntityManager();
	}
	@Override
	public User getUserById(String userid) {
		User u1 = em.find(User.class, userid);
		return u1;
	}
	@Override
	public String createUser(User usr, User loggedUser) {

		int loggedCode = loggedUser.getRolecode();
		System.out.println(loggedCode);
		if (loggedCode == 3)
		{
			String newUserName = usr.getUserName();
			User existingUserName = em.find(User.class, newUserName);
			System.out.println(existingUserName);
			if ((existingUserName == null))
			{
				em.getTransaction().begin();
				em.persist(usr);
				em.getTransaction().commit();
				
				return "True";
			}
			else
			{
				return("Username exists... !! Can not create new user");
			}
			}
		
		else
			return "You do not have permission to perform this action";
	
	}
	
	@Override
	public User verifyLogin(String userName, String passWord) throws CustomException {

		User u = em.find(User.class, userName);
		if(u.getPassward().equals(passWord))
		{
			return u;
		}
		else
		{
			throw new CustomException("Please Provide valid credentials");
		}
	  }
	}

