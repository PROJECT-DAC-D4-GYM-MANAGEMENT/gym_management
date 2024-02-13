package com.app.dto;

import java.util.List;

import com.app.entity.Slot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SlotTrainerDto {
     private SlotDTO slot;
     private List<TraineeDetailDTO> trainerList;
}
