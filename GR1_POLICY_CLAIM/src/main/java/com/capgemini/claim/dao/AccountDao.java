package com.capgemini.claim.dao;

import java.util.List;

import com.capgemini.claim.bean.Account;
import com.capgemini.claim.bean.User;


public interface AccountDao {
	
	public Account CreateAccountDetails(Account a);
	
	public abstract Account getAccountDetails(String userName);


}
