package com.skillindia.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.address.service.AddressService;
import com.skillindia.datajpa.message.model.Message;

@Controller
@CrossOrigin
public class AddressController {

		@Autowired
		AddressService addressService;
		
		public void setCandidateServiceObject(AddressService addressServiceObject) {
			this.addressService = addressServiceObject;
		}
		
		@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
		@CrossOrigin
		@ResponseBody
		public Message  addCandidate (@RequestBody Address address) {
			
			addressService.addAddress(address);
			return new Message("recordes added");
		}
		
}
