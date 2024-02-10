package com.app.dto;

public class SigninResponse {
	private Long id;
	private String jwt;
	private String fname;
	private String lname;
	private String email;
	private long number;
	private String role;
	
	
	
	public SigninResponse( String jwt, String fname, String lname, String email, long number, String role,Long id) {
		super();
		this.id = id;
		this.jwt = jwt;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "SigninResponse [jwt=" + jwt + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", number="
				+ number + ", role=" + role + "]";
	}
	
	
	
}
