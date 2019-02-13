package com.skillindia.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.address.service.AddressService;

@Controller
public class AddressController {

		@Autowired
		AddressService addressService;
		
		public void setCandidateServiceObject(AddressService addressServiceObject) {
			this.addressService = addressServiceObject;
		}
		
		@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
		@CrossOrigin
		public String  addCandidate (@RequestBody Address address) {
			
			addressService.addAddress(address);
			return "records added successfully";
		}
		
}
