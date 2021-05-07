package com.capgemini.claim.user;

import java.util.Scanner;

import com.capgemini.claim.bean.Account;
import com.capgemini.claim.bean.ClaimDetails;
import com.capgemini.claim.bean.Policy;
import com.capgemini.claim.bean.User;
import com.capgemini.claim.dao.AccountDao;
import com.capgemini.claim.dao.AccountDaoImpl;
import com.capgemini.claim.dao.ClaimDetailsDao;
import com.capgemini.claim.dao.ClaimDetailsDaoImpl;
import com.capgemini.claim.dao.PolicyDao;
import com.capgemini.claim.dao.PolicyDaoImpl;
import com.capgemini.claim.dao.UserDao;
import com.capgemini.claim.dao.UserDaoImpl;
import com.capgemini.customexception.CustomException;

public class TestProject {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int newRoleCode = 0;
		UserDao dao = new UserDaoImpl();
		
		User u = dao.getUserById("jay");
		System.out.println(u);
		
//		ClaimDetailsDao dao1 = new ClaimDetailsDaoImpl();
//		ClaimDetails cd = dao1.getClaimDetails(101D);
//		System.out.println(cd);
		
		
		  System.out.println("Enter username and password ...");
		  String userName = sc.next(); 
		  String passWord = sc.next();
		  User ruser;
		try {
			ruser = dao.verifyLogin(userName, passWord);
			System.out.println("Successfully logged in!! Welcome..");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

			  
		 /*
		 * System.out.println("Enter username"); String newUsername = sc.nextLine();
		 * System.out.println("Enter password"); String newPassword = sc.nextLine();
		 * System.out.println("Enter role code --> "); String newRoleCode1 =
		 * sc.nextLine();
		 * 
		 * if (newRoleCode1.equals("Insured")) newRoleCode = 1; else if
		 * (newRoleCode1.equals("Claim Handler")) newRoleCode = 2; else if
		 * (newRoleCode1.equals("Claim adjuster")) newRoleCode = 3;
		 */
		
		//User newUser = new User(newUsername, newPassword, newRoleCode);
		/*
		 * User newUser = new User("sahil", "sahil", 2); String res =
		 * dao.createUser(newUser, ruser); System.out.println(res);
		 * 
		 * if(res.equals("True")) { System.out.println("User Created Sucessfully");
		 * AccountDao acc = new AccountDaoImpl(); 
		 * Account a2 = new Account(newUser,
		 * 100000004l); Account a1 = acc.CreateAccountDetails(a2);
		 * System.out.println(a1); } else System.out.println(res);
		 */
		  
		/*
		 * AccountDao acc = new AccountDaoImpl();
		 * System.out.println(acc.getAccountDetails(ruser.getUserName())); Account
		 * logUserAccount = acc.getAccountDetails(ruser.getUserName());
		 * 
		 * PolicyDao pdao = new PolicyDaoImpl(); Policy p1 = new Policy(15000d,
		 * logUserAccount.getAccountNumber() , u.getUserName());
		 * System.out.println();pdao.createPolicy(p1);
		 */
	}

}
