package com.data.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {

	@NotEmpty
	private String username;
	@NotEmpty
	@Size(min=4,max=10)
	private String password;
	public LoginBean() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
