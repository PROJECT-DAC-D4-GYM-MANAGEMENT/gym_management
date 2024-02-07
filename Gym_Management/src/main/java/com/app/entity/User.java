package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class User extends BaseEntity {
	@Column(length = 30,name = "fname",nullable = false)
	private String first;
	@Column(length = 30,name = "lname",nullable = false)
	private String last;
	
	@Column(nullable = false,unique = true,length = 15)
	private long phone;
	@Column(length = 30,unique=true,nullable = false)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	@Column( nullable=false,columnDefinition = "CHAR(25)")
	private String role="user";

	public User() {
		super();
	}

	public User(String first, String last, long phone, String email, String password, String role) {
		super();
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.role = role;
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

	
	
	
	
}
