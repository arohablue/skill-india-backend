package com.skillindia.datajpa.candidate.Account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.candidate.Account.model.Account;
import com.skillindia.datajpa.candidate.Account.repository.AccountRepository;

@Service
public class AccountService {

		@Autowired
		private AccountRepository impl;
		
		public Account login(String accountName , String accountPassword) {
			Account accountcandidate = impl.findByAccountNameAndAccountPassword(accountPassword, accountPassword);
			return accountcandidate;
		}

	}


