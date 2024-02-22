package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dto.UserDTO;
import com.app.entity.UserEntity;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDTO editUser(Long userId, UserDTO udto) {
		
		UserEntity u = userDao.findById(userId).orElse(null);
		u.setFirst(udto.getFirst());
		u.setLast(udto.getLast());
		u.setPhone(udto.getPhone());
		u.setRole(udto.getRole());
		userDao.save(u);
		return null;
		
		
	}

}
