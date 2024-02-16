package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Trainer_Trainee_DTO {
	
		private Long id;
	    private String firstName;
	 
	    private String lastName;
	    private int contactNumber;
	
	    private String email;
	   
	    private String password;
	    
	    private String specialization;
	    
	    List<TraineeDTO> trainersList=new ArrayList<TraineeDTO>();

}
