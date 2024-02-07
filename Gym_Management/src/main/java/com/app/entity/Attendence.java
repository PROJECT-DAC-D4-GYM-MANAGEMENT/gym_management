package com.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.JoinColumn;

public class Attendence extends BaseEntity {
	
	@JoinColumn(name="member_id",nullable=false)
	private int memberID;
	private LocalDateTime checkInDateTime;
	private LocalDateTime checkOutDateTime;

}
