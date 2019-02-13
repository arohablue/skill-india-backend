package com.skillindia.datajpa.bankdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.bankdetails.model.BankDetails;
import com.skillindia.datajpa.bankdetails.repository.BankDetailsRepository;

@Service
public class BankDetailsService {

		@Autowired
		private BankDetailsRepository impl;
		
		public void addDetails(BankDetails bankdetails) {
				impl.save(bankdetails);
		}
		
		
	

}
