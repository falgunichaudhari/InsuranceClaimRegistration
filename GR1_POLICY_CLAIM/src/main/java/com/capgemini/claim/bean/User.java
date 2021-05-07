package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@Column(name="UserName")
	private String userName;
	
	@Column(name="Passward")
	private String passward ;
	
	@Column(name="Rolecode")
	private int rolecode;
	
	
	public User() {
		super();
	}


	public User(String userName, String passward, int rolecode) {
		super();
		this.userName = userName;
		this.passward = passward;
		this.rolecode = rolecode;

	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassward() {
		return passward;
	}


	public void setPassward(String passward) {
		this.passward = passward;
	}


	public int getRolecode() {
		return rolecode;
	}


	public void setRolecode(int rolecode) {
		this.rolecode = rolecode;
	}




	@Override
	public String toString() {
		return "User [userName=" + userName + ", passward=" + passward + ", rolecode=" + rolecode + " ]";
	}





	
	

}
