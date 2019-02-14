package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.admin.Account.service.AdminAccountService;

@Controller
public class AccountAdminController {
		
		@Autowired
		AdminAccountService adminaccountservice;
		
		public void setAdminServiceObject(AdminAccountService adminaccountserviceObject) {
			this.adminaccountservice = adminaccountservice;
		}
		
		
		@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
		@CrossOrigin
		@ResponseBody
		public String loginCandidate( @RequestParam(name="adminUserName",required=false) String username , @RequestParam(name="adminPassword",required=false) String password) {
			if(adminaccountservice.login(username, password) != null) {
				return "1";
			}
			return "0";
		} 


	}


