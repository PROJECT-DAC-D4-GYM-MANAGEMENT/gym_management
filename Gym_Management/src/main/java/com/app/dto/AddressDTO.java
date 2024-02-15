package com.app.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
   private Long id;
    private String addressLine1;

   
    private String addressLine2;
    
  
    private String city;
    
 
    private String state;
     
    
 
    private String zipCode;
    
  
    private String country;
}
