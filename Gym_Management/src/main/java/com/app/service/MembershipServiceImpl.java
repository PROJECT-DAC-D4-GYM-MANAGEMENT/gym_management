package com.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MembershipDao;
import com.app.dao.OrderDao;
import com.app.dao.PlanDao;
import com.app.dao.ProductDao;
import com.app.dao.SlotDao;
import com.app.dao.TraineeDao;
import com.app.dao.TrainerDao;
import com.app.dao.UserDao;
import com.app.dto.MembershipBaseDTO;
import com.app.dto.MembershipRequestDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.dto.ProductDTO;
import com.app.entity.Membership;
import com.app.entity.OrderItem;
import com.app.entity.Orders;
import com.app.entity.Plan;
import com.app.entity.Slot;
import com.app.entity.TraineeDetail;
import com.app.entity.TrainerDetail;
import com.app.entity.UserEntity;

@Transactional
@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    MembershipDao mshipDao;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    TraineeDao trainee;
    @Autowired
    TrainerDao trainer;
    @Autowired
    SlotDao slot;
    @Autowired
    PlanDao plan;
    @Autowired
    UserDao user;
    @Autowired
    OrderDao order;

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


	@Override
	public String addMembership(MembershipRequestDTO mem) {
		
		Membership m=new Membership();
		UserEntity u=user.findById(mem.getTraineeId()).orElse(null);
		u.setRole("trainee");
		 user.save(u);
		TraineeDetail t=new TraineeDetail();
		TraineeDetail t1=trainee.findById(mem.getTraineeId()).orElse(null);
		if(t1==null) {
			t.setUser(u);
			trainee.save(t);
		}
		
		Slot s=slot.findById(mem.getSlotId()).orElse(null);
		s.setCurrent(s.getCurrent()+1);
		
		m.setSlot(slot.getReferenceById(mem.getSlotId()));
		m.setPlan(plan.getReferenceById(mem.getPlanId()));
		m.setTrainee(trainee.getReferenceById(mem.getTraineeId()));
		m.setTrainer(trainer.getReferenceById(mem.getTrainerId()));
		LocalDate date=LocalDate.now();
		m.setStart(date);
		Plan p=plan.findById(mem.getPlanId()).orElse(null);
		m.setEnd(date.plusMonths(p.getDurationMonths()));
		
		Orders o=new Orders();
		o.setUser(u);
		o.setAmount(p.getPrice());
		o.setMembership(m);
		o.setType("membership");
		o.setDate(date);
		
		
		System.out.println(m);
		slot.save(s);
		mshipDao.save(m);
		order.save(o);
		return "success";
	}


}