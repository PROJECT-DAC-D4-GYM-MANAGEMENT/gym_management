package com.app.service;


import java.util.List;

import com.app.dto.AddressDTO;
import com.app.entity.Address;

public interface AddressService {

	 Address updateAddressDetails(Long addressId, AddressDTO adto);

	List<Address> getAllAddress();

	AddressDTO getAddressById(Long id);

	
	

	
}
