package com.app.dto;

import java.time.LocalDate;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class MembershipBaseDTO {

	@JsonProperty(access = Access.READ_ONLY)
	private Long id;

	private TraineeDetailDTO trainee;

	private TrainerDetailDTO trainer;

	private PlanDTO plan;

	private SlotDTO slot;

	private LocalDate start;

	private LocalDate end;

	private boolean status;

}
