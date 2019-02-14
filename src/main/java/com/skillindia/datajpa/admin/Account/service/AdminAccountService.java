package com.skillindia.datajpa.admin.Account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.admin.Account.repository.AdminAccountRepository;
import com.skillindia.datajpa.candidate.Account.model.Account;

@Service
public class AdminAccountService {
	
			@Autowired
			private AdminAccountRepository impl;
			
			public Account login(String accountName , String accountPassword) {
				Account accountcandidate = impl.findByAccountNameAndAccountPassword(accountName, accountPassword);
				return accountcandidate;
			}

}




