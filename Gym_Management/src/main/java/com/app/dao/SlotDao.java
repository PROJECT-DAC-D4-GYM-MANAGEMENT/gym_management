package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.Slot;

public interface SlotDao extends JpaRepository<Slot, Long> {
	@Query("select s from Slot s where s.current < s.total")
     List<Slot> getSlotTrainer();
}
