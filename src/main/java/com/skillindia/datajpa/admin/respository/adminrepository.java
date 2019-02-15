package com.skillindia.datajpa.admin.respository;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.admin.model.Admin;




	public interface adminrepository extends CrudRepository<Admin, Long>{
		
	}


