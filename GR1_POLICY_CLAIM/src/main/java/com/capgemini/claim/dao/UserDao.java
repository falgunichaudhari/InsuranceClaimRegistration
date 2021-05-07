package com.capgemini.claim.dao;

import com.capgemini.claim.bean.User;
import com.capgemini.customexception.CustomException;

public interface UserDao {
	public User getUserById(String userid);
	public String createUser(User usr, User loggedUser);
	public User verifyLogin(String userName, String passWord) throws CustomException;

}
