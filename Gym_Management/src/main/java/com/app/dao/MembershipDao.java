package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Membership;

public interface MembershipDao extends JpaRepository<Membership, Long> {

}
