package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Membership;
import com.app.entity.TrainerDetail;

public interface MembershipDao extends JpaRepository<Membership, Long> {
   
   List<Membership> findBySlotId(Long id);
}
