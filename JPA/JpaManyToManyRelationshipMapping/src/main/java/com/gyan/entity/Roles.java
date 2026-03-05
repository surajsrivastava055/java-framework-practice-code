package com.gyan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {

	@Id
	private int roleId;
	
	private String name;
	
	public Roles(int roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", name=" + name + "]";
	}
	
	
	
	
}
