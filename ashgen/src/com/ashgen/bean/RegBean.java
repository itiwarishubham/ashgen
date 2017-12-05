package com.ashgen.bean;

public class RegBean {
	String username;
	String email;
	int phoneno;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegBean [username=" + username + ", email=" + email + ", phoneno=" + phoneno + ", password=" + password
				+ "]";
	}
	public RegBean(String username, String email, int phoneno, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
	}
	
	

}
