package com.app.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
	
	@Column(length = 50,name = "fname",nullable = false)
	private String first;
	@Column(length = 50,name = "lname",nullable = false)
	private String last;
	@Column(nullable = false,unique = true,length = 15)
	private long phone;
	@Column(length = 100,unique=true,nullable = false)
	private String email;
	@Column(length = 400, nullable = false)
	private String password;
	@Column( nullable=false,columnDefinition = "CHAR(25)")
	private String role="user";

	

	public UserEntity(String first, String last, long phone, String email, String password, String role) {
		super();
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.role = role;
	}
         
	public UserEntity() {
		super();
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
	
	public Long getId() {
		return super.getId();
	}

	@Override
	public String toString() {
		return "UserEntity [first=" + first + ", last=" + last + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", role=" + role + "  id  " + super.getId()+"]";
	}

	
	
	
	
}
