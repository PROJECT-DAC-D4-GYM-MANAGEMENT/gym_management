package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FeedbackDao;
import com.app.entity.Feedback;

@Transactional
@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	
	@Autowired
	FeedbackDao feedbackDao;

	@Override
	public List<Feedback> getAllFeedback() {
		
		return feedbackDao.findAll();
	}

}
