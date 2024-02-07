package com.app.service;

import java.util.List;

import com.app.dto.MemberAddDto;
import com.app.dto.MemberResDto;
import com.app.entity.Member;

public interface MemberService  {

String addMember(MemberAddDto mem);

List<MemberResDto> getAllMembers();

MemberResDto getMemberById(Long memberId);	;
}
