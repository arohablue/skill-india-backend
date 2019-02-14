package com.skillindia.datajpa.admin.Account.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.Account.model.Account;

public interface AdminAccountRepository extends CrudRepository<Account, Long>{
			
		
		Account findByAccountNameAndAccountPassword( 
				@Param("adminUserName") String adminUserName, @Param("adminPassword") String adminPassword);
		}




