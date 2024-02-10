package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.app.dao.UserDao;
import com.app.dto.MemberResDto;
import com.app.dto.SignupReq;
import com.app.entity.UserEntity;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    @Autowired
    private ModelMapper mapper;
	@Override
	public String addMember(SignupReq user) {
		userDao.save(mapper.map(user, UserEntity.class));
	 	return "Successful";
		
	}
	
	@Override
	public Long getId(String email, String pass) {
		Long id= userDao.findId(email, pass);
		System.out.println(userDao.findById(id));;
		return id ;
	}
	
	
}
