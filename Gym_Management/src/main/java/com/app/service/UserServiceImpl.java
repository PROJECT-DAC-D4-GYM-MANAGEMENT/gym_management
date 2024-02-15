package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dto.MemberResDto;
import com.app.dto.SigninResponse;
import com.app.dto.SignupReq;
import com.app.dto.UserDTO;
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
		Long id = userDao.findId(email, pass);
		System.out.println(userDao.findById(id));
		;
		return id;
	}

	@Override
	public List<SigninResponse> getAllUsers() {

		return userDao.findAll().stream().map(u -> mapper.map(u, SigninResponse.class)).collect(Collectors.toList());
	}

	@Override
	public SigninResponse getUserDetailsById(Long userId) {
		UserEntity u = userDao.findUserById(userId);
		return mapper.map(u, SigninResponse.class);
	}

	@Override
	public UserEntity updateUserDetails(Long userId, UserDTO updateItem) {
		
		return userDao.save(userDao.findById(userId).orElseThrow(() -> new RuntimeException("Item not found")));
	}
}
