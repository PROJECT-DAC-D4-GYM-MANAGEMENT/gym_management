package com.app.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.dto.UserDTO;
import com.app.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    @Autowired
    private ModelMapper mapper;
	@Override
	public String addMember(UserDTO user) {
		System.out.println(user);
		userDao.save(mapper.map(user, User.class));
	 	return "Successful";
		
	}
	@Override
	public List<UserDTO> getAllUsers() {
		
		return userDao.findAll().stream().map(u->mapper.map(u,UserDTO.class)).collect(Collectors.toList());
	}
	@Override
	public UserDTO getUserDetailsById(Long userId) {
		User u = userDao.findUserById(userId);
		return mapper.map(u, UserDTO.class);
	}
}
