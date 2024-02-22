package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Feedback extends BaseEntity {
	
	
	private String name;
	@Column(length = 2000,nullable=false)
	private String image;
	@Column(length = 2000)
	private String message;
	private int rating;

}
