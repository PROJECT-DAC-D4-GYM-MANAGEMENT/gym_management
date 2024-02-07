package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Member;

public interface MemberDao extends JpaRepository<Member, Long> {

}
