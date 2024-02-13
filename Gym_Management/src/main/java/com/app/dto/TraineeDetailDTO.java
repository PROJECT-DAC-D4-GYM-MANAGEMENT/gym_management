package com.app.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.app.entity.UserEntity;

public class TraineeDetailDTO {
	

    private UserEntity user;
	private  boolean status;
	private String pic;

}
