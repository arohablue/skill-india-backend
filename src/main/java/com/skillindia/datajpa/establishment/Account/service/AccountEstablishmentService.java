package com.skillindia.datajpa.establishment.Account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.establishment.Account.model.AccountEstablishment;
import com.skillindia.datajpa.establishment.Account.repository.AccountEstablishmentRepository;
import com.skillindia.datajpa.establishment.model.Establishment;

@Service
public class AccountEstablishmentService {

		@Autowired
		private AccountEstablishmentRepository impl;
		
	
		public AccountEstablishment login(String username , String Password) {
			AccountEstablishment est = impl.findByEstUserIdAndEstUserPassword(username, Password);
			return est;
		}


}
