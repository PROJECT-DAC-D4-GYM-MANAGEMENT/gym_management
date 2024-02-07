package com.app.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class UserDto {
	@JsonProperty(access = Access.READ_ONLY) 
     private Long id; 
	@JsonProperty(value="fname")
	private String first;
	@JsonProperty(value="lname")
	private String last;
	@JsonProperty(value="phone")
	private long phone;
	@JsonProperty(value="email")
	private String email;
	@JsonProperty(value="password",access = Access.WRITE_ONLY)
	private String password;
	@JsonProperty(access = Access.READ_ONLY) 
	private String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", first=" + first + ", last=" + last + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}
	
	
}


//@Column(length = 30,name = "fname",nullable = false)
//private String first;
//@Column(length = 30,name = "lname",nullable = false)
//private String last;
//
//@Column(nullable = false,unique = true,length = 15)
//private int phone;
//@Column(length = 30,unique=true,nullable = false)
//private String email;
//@Column(length = 25, nullable = false)
//private String password;
//@Column( nullable=false,columnDefinition = "CHAR(25) DEFAULT 'member'")
//private String role;