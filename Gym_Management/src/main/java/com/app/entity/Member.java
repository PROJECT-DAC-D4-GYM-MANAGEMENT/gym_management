package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Member extends BaseEntity {
	@Column(length = 20)
	private String FirstName;
	@Column(length = 20)
	private String LastName;
	private LocalDate DateOfBirth;
	private String Gender;
	private int ContactNumber;
	@Column(length = 20,unique=true)
	private String Email;
	@Column(length = 25, nullable = false)
	private String password;
	private LocalDate MembershipStartDate;
	private LocalDate MembershipEndDate;
	private String MembershipType;

}
