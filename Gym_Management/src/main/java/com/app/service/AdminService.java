package com.app.service;

import com.app.dto.UserDTO;

public interface AdminService {

	UserDTO editUser(Long userId, UserDTO udto);

}
