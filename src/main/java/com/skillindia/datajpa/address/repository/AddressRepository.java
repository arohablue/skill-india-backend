package com.skillindia.datajpa.address.repository;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.address.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{
		
	Address findByaddressId(Long id);
	Address findBylocalAddress(String address);
	Address findByCity(String city);
	Address findByState(String state);
	
}
