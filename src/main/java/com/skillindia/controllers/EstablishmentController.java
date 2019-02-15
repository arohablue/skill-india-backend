package com.skillindia.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.service.EstablishmentService;
import com.skillindia.datajpa.message.model.Message;

@Controller
@CrossOrigin
public class EstablishmentController {

	@Autowired
	EstablishmentService esService;

	public void setEstablishmentServiceObject(EstablishmentService establishmentServiceObject) {
		this.esService = establishmentServiceObject;
	}
	
	@RequestMapping(value = "/addEstablishment", method = RequestMethod.POST)
	public Message  addEstablishment(@RequestBody Establishment est) {
		esService.addEstablishment(est);
		return new Message("recordes added");
	} 
	
	@RequestMapping(value = "/loginEstablishment", method = RequestMethod.GET)
	@ResponseBody
	public Message loginEstablishment( @RequestParam("username") String username , @RequestParam("password") String password) {
		if(esService.login(username, password) != null) {
			return new Message("success");
		}
		return new Message("failure");
	} 
	
	@RequestMapping(value = "/establishmentList", method = RequestMethod.GET)
	@ResponseBody
	public List<Establishment> establishmentList() {
		return esService.getAllEstablishments();
	}
	
	@RequestMapping(value = "/establishmentListByCandidate", method = RequestMethod.GET)
	
	@ResponseBody
	public List<Establishment> establishmentListByCandidate(@RequestBody Candidate candidate) {
		return esService.establishmentListByCandidate(candidate);
	}
}
