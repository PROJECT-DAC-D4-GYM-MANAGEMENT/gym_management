package com.app.entity;

import java.time.LocalDate;

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
public class Invoice extends BaseEntity {
	@JoinColumn(name="member_id",nullable=false)
	private int memberID;
	private LocalDate issueDate;
	private LocalDate dueDate;
	private double amountDue;
	private String Status;

}
