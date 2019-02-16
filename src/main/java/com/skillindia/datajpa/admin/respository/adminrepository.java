package com.skillindia.datajpa.admin.respository;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.establishment.model.Establishment;




	public interface adminrepository extends CrudRepository<Admin, Long>{
		Admin findByAccount(Account acc);
		
	}


