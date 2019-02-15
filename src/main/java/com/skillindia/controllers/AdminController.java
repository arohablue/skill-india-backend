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
import com.skillindia.datajpa.message.model.Message;


@Controller
@CrossOrigin
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	public void setAdminServiceObject(AdminService adminServiceObject) {
		this.adminService = adminServiceObject;
	}
	
	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	public String  addCandidate (@RequestBody Admin admin) {
		adminService.addAdmin(admin);
		return "records added successfully";
	}
	
}
