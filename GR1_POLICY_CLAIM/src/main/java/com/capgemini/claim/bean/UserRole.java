package com.capgemini.claim.bean;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class UserRole {
	
	@Id
	@Column(name="roleid")
	private int roleId;
	
	@Column(name="rolename")
	private String roleName;
	
	
	public UserRole() {
		super();
	}


	public UserRole(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}


	public int getRoleId() {
		return roleId;
	}


	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "UserRole [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
	

}
