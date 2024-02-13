package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MembershipDao;
import com.app.dao.ProductDao;
import com.app.dto.MembershipDTO;
import com.app.entity.Membership;

@Transactional
@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    MembershipDao mshipDao;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<MembershipDTO> getAllMemberships() {

       List<Membership>me=  mshipDao.findAll();
       me.forEach((e)->{
        	 e.getTrainee().getPic();
        	 e.getPlan().getPrice();
        	 e.getTrainer().getSalary();
        	 e.getSlot().getName();
        	 System.out.println(e);
         });
//         
    	
       List<MembershipDTO> dto=  me.stream().map(m -> mapper.map(m, MembershipDTO.class)).collect(Collectors.toList());
       dto.forEach(e->System.out.println(e));
         System.out.println();
   return dto;
    }

}