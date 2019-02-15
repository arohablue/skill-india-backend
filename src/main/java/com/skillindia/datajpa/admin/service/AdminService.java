package com.skillindia.datajpa.admin.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.admin.respository.adminrepository;


	@Service
	public class AdminService {
		
		@Autowired
		private adminrepository impl;
		
		public void addAdmin(Admin admin) {
				impl.save(admin);
		}
		

	}


