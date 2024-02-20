package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.SocialDao;
import com.app.dao.UserDao;
import com.app.dto.AddressDTO;
import com.app.dto.SocialDTO;
import com.app.entity.Social;

@Transactional
@Service
public class SocialServiceImpl implements SocialService {

	@Autowired
	SocialDao socialDao;
	@Autowired
	UserDao u;
	@Autowired
	private ModelMapper mapper;

	@Override
	public SocialDTO save(SocialDTO social,Long id) {

		 Social s = mapper.map(social, Social.class);
	

		s.setUser(u.getReferenceById(id));
		
		return mapper.map(socialDao.save(s),SocialDTO.class);
	}

	@Override
	public SocialDTO getSocialDetailsById(Long id) {
		
		return mapper.map(socialDao.findById(id).orElse(null), SocialDTO.class);
	}
	
}
