package com.app.service;

import com.app.dto.AddressDTO;
import com.app.entity.Address;

public interface AddressService {

	 Address updateAddressDetails(Long addressId, AddressDTO updatedItem);

	
}
