package com.app.dto;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TrainerDTO 
{
	    private Long id;
	    private String firstName;
	 
	    private String lastName;
	    private int contactNumber;
	
	    private String email;
	   
	    private String password;
	    
	    private String specialization;

}
