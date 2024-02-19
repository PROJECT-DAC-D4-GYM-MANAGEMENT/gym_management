package com.app.service;

import java.util.List;

import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipRequestDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.ProductDTO;
import com.app.entity.Membership;

public interface MembershipService {

	List<MembershipBaseDTO> getAllMemberships();

	

	MembershipBaseDTO getMembershipDetailsById(Long mId);



	String deleteMembershipById(Long mid);


	Membership updateMembershipDetails(Long mid, MembershipUpdateDTO updatedItem);
	
	
	String addMembership( MembershipRequestDTO mem);
	

}
