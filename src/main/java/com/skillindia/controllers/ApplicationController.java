package com.skillindia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillindia.CanApplnRepo;
import com.skillindia.EstApplnRepo;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.CandApplication;
import com.skillindia.datajpa.EstApplication;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.candidate.service.CandidateService;

@RestController
@CrossOrigin
public class ApplicationController {
	
	@Autowired
	CandidateService candidateService;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	CanApplnRepo canApplnRepo;
	@Autowired
	EstApplnRepo estApplnRepo;

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateService = candidateServiceObject;
	}

	@RequestMapping(value = "/candidate/establishments", method = RequestMethod.POST)
	@ResponseBody
	public List<CandApplication> candidateEstablishmnets(@RequestParam("canId") String canID) {
		
		List<CandApplication> estlist = canApplnRepo.findAllBycanId(canID);
		if(estlist != null) {
			return estlist;
		}
		return null ;
		
	}
	
	
	@RequestMapping(value = "/establishment/candidates", method = RequestMethod.POST)
	@ResponseBody
	public List<EstApplication> EstablishmnetsCandidates(@RequestParam("estId") String estID) {
		
		List<EstApplication> canlist = estApplnRepo.findAllByestId(estID);
		if(canlist != null) {
			return canlist;
		}
		return null ;
	}

}
