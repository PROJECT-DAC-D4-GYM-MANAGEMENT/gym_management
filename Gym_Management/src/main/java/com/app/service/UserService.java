package com.app.service;

import java.util.List;

import com.app.dto.UserDTO;

public interface UserService  {

String addMember(UserDTO user);

List<UserDTO> getAllUsers();

UserDTO getUserDetailsById(Long userId);	
}
