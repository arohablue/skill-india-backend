package com.skillindia.datajpa.candidate.Account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.Account.model.Account;
import com.skillindia.datajpa.candidate.model.Candidate;

public interface AccountRepository extends CrudRepository<Account, Long>{
		
	
	Account findByAccountNameAndAccountPassword( 
			@Param("accountName") String accountName, @Param("accountPassword") String accountPassword);
	}



