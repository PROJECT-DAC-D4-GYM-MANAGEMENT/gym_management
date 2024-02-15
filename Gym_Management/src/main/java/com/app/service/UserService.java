package com.app.service;

import java.util.List;

import com.app.dto.MemberResDto;
import com.app.dto.SigninResponse;
import com.app.dto.SignupReq;
import com.app.dto.UserDTO;
import com.app.entity.UserEntity;

public interface UserService  {

String addMember(SignupReq user);
Long getId(String email,String pass);
List<SigninResponse> getAllUsers();
SigninResponse getUserDetailsById(Long userId);
UserEntity getUserById(Long id);
UserEntity updateUserDetails(Long userId, UserDTO updateItem);

}
