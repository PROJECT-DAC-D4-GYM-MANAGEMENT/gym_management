package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MemberDao;
import com.app.dto.MemberAddDto;
import com.app.entity.Member;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
	private MemberDao memberDao;
    private ModelMapper mapper;
	@Override
	public String addMember(MemberAddDto mem) {
	 	memberDao.save(mapper.map(mem, Member.class));
	 	return "Successful";
		
	}
}
