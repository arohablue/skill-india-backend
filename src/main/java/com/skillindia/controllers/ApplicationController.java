package com.skillindia.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.CanApplnRepo;
import com.skillindia.datajpa.CandApplication;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.service.CandidateService;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.service.EstablishmentService;
import com.skillindia.datajpa.message.model.Message;

@RestController
@CrossOrigin
public class ApplicationController {
	
	@Autowired
	CandidateService candidateService;
	@Autowired
	EstablishmentService establishmentService;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	CanApplnRepo canApplnRepo;

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateService = candidateServiceObject;
	}

	@RequestMapping(value = "candidate/applied/establishments", method = RequestMethod.POST)
	@ResponseBody
	public List<Establishment> candidateEstablishmnets(@RequestParam("canId") int canID) {
		
		List<CandApplication> estlist = canApplnRepo.findAllBycanId(canID);
		List<Establishment> establishments = new ArrayList<Establishment>();
		System.out.println(estlist);
		if(estlist != null) {
			for (CandApplication candApplication : estlist) {
				establishments.add(establishmentService.establishmentFindByID(candApplication.getEstId()));
			}
			return establishments;
		}
		return null ;
		
	}
	
	@RequestMapping(value = "establishment/applied/candidates", method = RequestMethod.POST)
	@ResponseBody
	public List<Candidate> establishmnetsCandidate(@RequestParam("estId") int estId) {
		
		List<CandApplication> estlist = canApplnRepo.findAllByestId(estId);
		List<Candidate> candidates = new ArrayList<Candidate>();
		
		if(estlist != null) {
			for (CandApplication candApplication : estlist) {
				candidates.add(candidateService.candidateFindByID(candApplication.getCanId()));
			}
			return candidates;
		}
		
		return null ;
		
	}
	
	@RequestMapping(value = "candidate/application/apply", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public CandApplication candidateApply(@RequestBody CandApplication canApp) {
		
		int can = canApp.getCanId();
		int et = canApp.getAppId();
		System.out.println("here"+canApp);
		return canApplnRepo.save(canApp);
		
	}
	
	@RequestMapping(value = "candidate/application/status", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Message candidateAppstatus(@RequestBody CandApplication canApp) {
		System.out.println("here"+canApp);
		canApplnRepo.findAllByestIdAndCanId(canApp.getEstId(),canApp.getCanId());
		System.out.println(canApp.getApp_status());
		return new Message(canApp.getApp_status());
		
	}
	
	
	

}
