package com.app.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MemberDao;
import com.app.dto.MemberAddDto;
import com.app.dto.MemberResDto;
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
	@Override
	public List<MemberResDto> getAllMembers() {
	
		return memberDao.findAll().stream().map(mem->mapper.map(mem, MemberResDto.class)).collect(Collectors.toList());
	}
	@Override
	public MemberResDto getMemberById(Long memberId) {
		Member m = memberDao.getMemberById(memberId);
		return mapper.map(m, MemberResDto.class);
	}
}
