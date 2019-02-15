package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.message.model.Message;



@RestController
@CrossOrigin
public class LoginController  {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@RequestMapping(value = "/account/add", method = RequestMethod.POST)
	@ResponseBody
	public Account  addAccount(@RequestBody Account acc) {
		Account acct = loginRepository.save(acc);
		return acct;
	} 
	
	
	@RequestMapping(value = "account/login", method = RequestMethod.POST)
	@ResponseBody
	public String  addEstablishment(@RequestBody Account acc) {
			Account acct = loginRepository.findByusernameAndPassword(acc.getUsername(), acc.getPassword());
		if( acct!= null) {
			return "fone";
		}
		return "not done";
	} 

}
