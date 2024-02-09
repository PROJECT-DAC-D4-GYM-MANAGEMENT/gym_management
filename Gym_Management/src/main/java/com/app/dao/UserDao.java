package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity, Long> {
Optional<UserEntity> findByEmail(String email);
}
