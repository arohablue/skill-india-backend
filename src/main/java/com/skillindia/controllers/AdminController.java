package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.admin.service.AdminService;


@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	public void setAdminServiceObject(AdminService adminServiceObject) {
		this.adminService = adminServiceObject;
	}
	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	@CrossOrigin
	public String  addCandidate (@RequestBody Admin admin) {
		adminService.addAdmin(admin);
		return "records added successfully";
	}
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
	@CrossOrigin
	@ResponseBody
	public String loginCandidate( @RequestParam(name="username",required=false) String username , @RequestParam(name="password",required=false) String password) {
		if(adminService.login(username, password) != null) {
			return "1";
		}
		return "0";
	} 


}
