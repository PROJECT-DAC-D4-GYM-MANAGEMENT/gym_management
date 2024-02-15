package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MembershipDao;
import com.app.dao.ProductDao;
import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.ProductDTO;
import com.app.entity.Membership;

@Transactional
@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    MembershipDao mshipDao;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<MembershipBaseDTO> getAllMemberships() {

       List<Membership>me=  mshipDao.findAll();
       me.forEach((e)->{
        	 e.getTrainee().getPic();
        	 e.getPlan().getPrice();
        	 e.getTrainer().getSalary();
        	 e.getSlot().getName();
        	 System.out.println(e);
         });
//         
    	
       List<MembershipBaseDTO> dto=  me.stream().map(m -> mapper.map(m, MembershipBaseDTO.class)).collect(Collectors.toList());
       dto.forEach(e->System.out.println(e));
         System.out.println();
         return dto;
    }


	@Override
	public MembershipBaseDTO getMembershipDetailsById(Long mId) {
		Membership m = mshipDao.findMembershipById(mId);
		return mapper.map(m, MembershipBaseDTO.class);
	}


	@Override
	public String deleteMembershipById(Long mid) {
		mshipDao.deleteById(mid);
		return "succesfully deleted";
	}


	@Override
	public Membership updateMembershipDetails(Long mid, MembershipUpdateDTO updatedItem) {
		
		return mshipDao.save(mshipDao.findById(mid).orElseThrow(() -> new RuntimeException("Item not found")));
	}

}