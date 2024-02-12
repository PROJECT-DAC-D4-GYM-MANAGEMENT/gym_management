package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address  extends BaseEntity{

	@Column(name = "address_line_1",length=200)
    private String addressLine1;

    @Column(name = "address_line_2" ,length=200)
    private String addressLine2;
    
    @Column(length=200)
    private String city;
    
    @Column(length=50)
    private String state;
     
    
    @Column(name = "zip_code")
    private String zipCode;
    
    @Column(length=50)
    private String country;
    
    @OneToOne( fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id" ,nullable = false)
    private UserEntity user;

	
}
