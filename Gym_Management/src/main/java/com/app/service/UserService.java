package com.app.service;

import com.app.dto.MemberResDto;
import com.app.dto.SignupReq;
import com.app.entity.UserEntity;

public interface UserService  {

String addMember(SignupReq user);
Long getId(String email,String pass);

}
