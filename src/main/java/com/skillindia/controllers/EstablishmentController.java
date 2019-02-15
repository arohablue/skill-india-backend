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
import org.springframework.web.bind.annotation.RestController;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.service.EstablishmentService;
import com.skillindia.datajpa.message.model.Message;

@RestController
@CrossOrigin
public class EstablishmentController {

	@Autowired
	EstablishmentService esService;

	public void setEstablishmentServiceObject(EstablishmentService establishmentServiceObject) {
		this.esService = establishmentServiceObject;
	}
	
	@RequestMapping(value = "/add/establishment", method = RequestMethod.POST)
	public Message addEstablishment(@RequestBody Account acc) {
		esService.addEstablishment(acc);
		return new Message("sccuess");
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
