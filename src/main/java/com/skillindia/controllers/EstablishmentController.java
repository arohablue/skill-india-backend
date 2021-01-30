package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.service.EstablishmentService;

@Controller
public class EstablishmentController {

	@Autowired
	EstablishmentService esService;

	public void setEstablishmentServiceObject(EstablishmentService establishmentServiceObject) {
		this.esService = establishmentServiceObject;
	}

	@RequestMapping(value = "/addEstablishment", method = RequestMethod.POST)
	@CrossOrigin
	public String addEstablishment(@RequestBody Establishment est) {
		esService.addEstablishment(est);
		return "records added successfully";
	}

	@RequestMapping(value = "/loginEstablishment", method = RequestMethod.GET)
	@CrossOrigin
	@ResponseBody
	public String loginEstablishment(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (esService.login(username, password) != null) {
			return "1";
		}
		return "0";

	} 
	
	@RequestMapping(value = "/dashboardEstablishment", method = RequestMethod.POST)
	@CrossOrigin
	@ResponseBody
	public String dashboardEstablishment(@RequestBody Establishment est) {
		System.out.println(est.getEstName());
		System.out.println(est.getEstId());
		System.out.println("hitted");
		//esService.dashboardDetails(est);
		
		return "records Fetched successfully";

	}
}
