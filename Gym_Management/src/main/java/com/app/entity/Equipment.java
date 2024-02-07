package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Equipment extends BaseEntity {
	@Column(length = 20)
	private String equipName;
	private int qtyAvailable;
	@Column(length = 20)
	private String manufacturer;
	private LocalDate purchaseDate;

}
