package com.skillindia.datajpa.bankdetails.repository;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.bankdetails.model.BankDetails;

public interface BankDetailsRepository extends CrudRepository<BankDetails, Long>{
		
	BankDetails findBybankId(Long id);
	BankDetails findByAccountNumber(Long number);
	BankDetails findByBankName(String name);
	BankDetails findByBankBranch(String name);
	BankDetails findByBankIFSC(String number);

}
