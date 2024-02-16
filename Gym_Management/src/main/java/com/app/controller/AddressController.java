package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AddressDTO;
import com.app.dto.MembershipUpdateDTO;
import com.app.entity.Address;
import com.app.entity.Membership;
import com.app.service.AddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/{id}")
	public Address updateAddressDetails(@PathVariable Long id, @RequestBody AddressDTO adto) {

		return addressService.updateAddressDetails(id, adto);
	}
	
	@GetMapping
	public List<Address> getAllAddress() {
		return addressService.getAllAddress();
	}
	
///////////
}
