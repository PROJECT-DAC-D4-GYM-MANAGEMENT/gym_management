package com.app.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class MembershipUpdateDTO {
	
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;

	private TrainerDetailDTO trainer;

	private PlanDTO plan;

	private SlotDTO slot;

	private boolean status;

}
