package com.skillindia.datajpa.admin.respository;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.admin.model.Admin;




	public interface adminrepository extends CrudRepository<Admin, Long>{
		
		
		Admin findByadminName(Long id);
		Admin findByadminEmaiIId(Long id);
		Admin findByAdminPassword(Long id);
		Admin findByAdminUserNameAndAdminPassword(
	@Param("adminUserName") String adminUserName,@Param("adminPassword") String adminPassword );
		
	

	}


