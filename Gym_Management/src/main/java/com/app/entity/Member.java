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
public class Member extends BaseEntity {
	@Column(length = 30,name = "fname",nullable = false)
	private String firstName;
	@Column(length = 30,name = "lname",nullable = false)
	private String lastName;
	@Column(nullable = false,unique = true)
	private int phone;
	@Column(length = 30,unique=true,nullable = false)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	@Column( nullable=false,columnDefinition = "CHAR(25) DEFAULT 'member'")
	private String type;

	public Member() {
		super();
	}

	public Member(String firstName, String lastName, int phone, String email, String password, String type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", type=" + type + "]";
	}
	

	
}
