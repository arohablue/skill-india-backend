package com.skillindia.datajpa.address.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.address.repository.AddressRepository;

@Service
public class AddressService {

		@Autowired
		private AddressRepository impl;
		
		public void addAddress(Address address) {
				impl.save(address);
		}
		
		
	

}
