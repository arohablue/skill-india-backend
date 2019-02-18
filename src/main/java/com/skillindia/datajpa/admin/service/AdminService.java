package com.skillindia.datajpa.admin.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.admin.respository.adminrepository;
import com.skillindia.datajpa.candidate.model.Candidate;


	@Service
	public class AdminService {
		
		@Autowired
		private adminrepository impl;
		@Autowired
		LoginRepository loginRepository;
		
		public void addAdmin(Account acc) {
			
			Admin adm = acc.getAdmin();
			adm.setAccount(acc);
			Account  ac =loginRepository.save(acc);
		}
		

	}


