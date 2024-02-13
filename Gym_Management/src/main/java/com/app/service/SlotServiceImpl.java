package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MembershipDao;
import com.app.dao.SlotDao;
import com.app.dao.TraineeDao;
import com.app.dao.TrainerDao;
import com.app.dto.SlotTrainerDto;
import com.app.entity.Slot;
import com.app.entity.TrainerDetail;
import com.app.util.SlotTrainerUtil;


@Transactional
@Service
public class SlotServiceImpl implements SlotService{
   @Autowired
	private SlotDao slot;
   
   @Autowired
   private TrainerDao trainerDao;
   
   @Autowired
   private MembershipDao membershipDao;
   
   @Autowired
   private ModelMapper mapper;

@Override
public List<SlotTrainerDto> getSlotTrainer() {
	
	   
	   List <TrainerDetail> all=trainerDao.findAll();
	   List<SlotTrainerUtil> s=new ArrayList<SlotTrainerUtil>();
	   
	   
	   slot.getSlotTrainer().forEach((e)->{
		   
		   List<TrainerDetail> t=membershipDao.findBySlotId(e.getId()).stream().map(i->i.getTrainer()).collect(Collectors.toList());
		  ;
		   SlotTrainerUtil slot = new SlotTrainerUtil( e , 
				   all.stream().
				   filter(i->  !t.stream().anyMatch(j-> j.getId()==i.getId()))
				   .collect(Collectors.toList()));
		   
		   s.add(slot);
	   });
  
	  
	   
	return s.stream().map(m-> mapper.map(m, SlotTrainerDto.class)).collect(Collectors.toList());
}
}
