package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Social;

public interface SocialDao extends JpaRepository<Social, Long> {

}
