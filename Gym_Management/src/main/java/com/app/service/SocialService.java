package com.app.service;

import com.app.dto.SocialDTO;

public interface SocialService {
	SocialDTO save(SocialDTO social,Long id);

	SocialDTO getSocialDetailsById(Long id);

}
