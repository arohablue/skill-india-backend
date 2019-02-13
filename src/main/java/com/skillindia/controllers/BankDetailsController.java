package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillindia.datajpa.bankdetails.model.BankDetails;
import com.skillindia.datajpa.bankdetails.service.BankDetailsService;
import com.skillindia.datajpa.candidate.model.Candidate;

@Controller
public class BankDetailsController {

		@Autowired
		BankDetailsService bankdetailsService;
		
		public void setbankdetailsServiceObject(BankDetailsService bankdetailsServiceObject) {
			this.bankdetailsService = bankdetailsServiceObject;
		}
		
		@RequestMapping(value = "/addBankDetails", method = RequestMethod.POST)
		@CrossOrigin
		public String  addCandidate (@RequestBody BankDetails bankdetails) {
			
	
			bankdetailsService.addDetails(bankdetails);
			return "records added successfully";
		}
		
}
