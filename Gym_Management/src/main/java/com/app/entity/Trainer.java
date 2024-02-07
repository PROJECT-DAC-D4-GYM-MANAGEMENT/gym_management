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
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Trainer extends BaseEntity {
	@Column(length = 20)
	private String FirstName;
	@Column(length = 20)
	private String LastName;
	private int ContactNumber;
	@Column(length = 20,unique=true)
	private String Email;
	@Column(length = 25, nullable = false)
	private String password;
	private String Specialization;

}
