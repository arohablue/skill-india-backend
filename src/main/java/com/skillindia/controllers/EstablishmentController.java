package com.skillindia.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillindia.datajpa.establishment.repository.Establishment;
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
	public String  addMovie(@RequestBody Establishment est) {
		
		System.out.println("hitted");
		System.out.println(est.getEstContactNumber());
		System.out.println(est);
		esService.addEstablishment(est);
		return "records added successfully";
	} 

}
