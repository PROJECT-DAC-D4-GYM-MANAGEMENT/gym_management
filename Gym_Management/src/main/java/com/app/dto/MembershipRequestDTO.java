package com.app.dto;



import java.time.LocalDate;

import com.app.dao.PlanDao;
import com.app.dao.SlotDao;
import com.app.dao.TraineeDao;
import com.app.entity.Plan;
import com.app.entity.Slot;
import com.app.entity.TraineeDetail;
import com.app.entity.TrainerDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MembershipRequestDTO {
	
	private Long traineeId;


	private Long trainerId;

	
	private Long planId;


	private Long slotId;

}




