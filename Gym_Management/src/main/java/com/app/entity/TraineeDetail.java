package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TraineeDetail extends BaseEntity{

	@OneToOne( fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "user_id" ,nullable = false)
    private UserEntity user;
	private  boolean status;
	@Column(length=500)
	private String pic;
//	@OneToMany(mappedBy = "trainee") 
//	private List<Membership> membership=new ArrayList<Membership>();
}
