package com.app.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="dietPlan")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DietPlan extends BaseEntity
{
	 
	 private String planname;
	 private String breakfast;
	 private String lunch;
	 private String preworkout;
	 private String dinner;

}
