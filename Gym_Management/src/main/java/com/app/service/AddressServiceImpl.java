package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AddressDao;
import com.app.dao.UserDao;
import com.app.dto.AddressDTO;
import com.app.entity.Address;
import com.app.entity.UserEntity;

@Transactional
@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressDao addressDao;
	@Autowired
	private UserDao u;
	@Autowired
	private ModelMapper mapper;

	@Override
	public Address updateAddressDetails(Long addressId, AddressDTO updatedItem) {
		
		
		
		Address a =mapper.map(updatedItem, Address.class);

		a.setUser(u.findById(addressId).orElse(null));
		
		
		return addressDao.save(a);
	}


}
