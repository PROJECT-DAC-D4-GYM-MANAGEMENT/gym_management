package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DietPlanDao;
import com.app.entity.DietPlan;

@Service
@Transactional
public class DietPlanServiceImpl implements DietPlanService
{
	@Autowired
	private DietPlanDao dietPlanDao;

	@Override
	public DietPlan findById(Long planId) {
		// TODO Auto-generated method stub
		Optional<DietPlan> dp = dietPlanDao.findById(planId);
		return dp.orElse(null);
	}

	@Override
	public List<DietPlan> findAll() {
		// TODO Auto-generated method stub
		return dietPlanDao.findAll();
	}

	@Override
	public DietPlan save(DietPlan dp) {
		// TODO Auto-generated method stub
		return dietPlanDao.save(dp);
	}

	@Override
	public DietPlan update(DietPlan dp) {
		// TODO Auto-generated method stub
		return dietPlanDao.save(dp);
	}

	@Override
	public void deleteById(Long planId) {
		// TODO Auto-generated method stub
		dietPlanDao.deleteById(planId);
	}

}
