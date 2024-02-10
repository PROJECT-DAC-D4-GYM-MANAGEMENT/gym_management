package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dto.UserDto;
import com.app.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    @Autowired
    private ModelMapper mapper;
	@Override
	public String addMember(UserDto user) {
		System.out.println(user);
		userDao.save(mapper.map(user, User.class));
	 	return "Successful";
		
	}
}
