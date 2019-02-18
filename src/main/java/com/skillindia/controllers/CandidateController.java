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
import com.skillindia.datajpa.CanApplnRepo;
import com.skillindia.datajpa.CandApplication;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;
import com.skillindia.datajpa.candidate.service.CandidateService;
import com.skillindia.datajpa.establishment.repository.EstablishmentRepository;
import com.skillindia.datajpa.message.model.Message;

@RestController
@CrossOrigin
public class CandidateController {

	@Autowired
	CandidateService candidateService;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	EstablishmentRepository establishmentRepository;
	@Autowired
	CandidateRepository candidateRepository;
	@Autowired
	CanApplnRepo canApplnRepo;
	

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateService = candidateServiceObject;
	}

	@RequestMapping(value = "/candidate/register", method = RequestMethod.POST)
	@ResponseBody
	public Account candidateRegister(@RequestBody Account acc) {
		Account cc = candidateService.addCandidate(acc);
		return cc;
	}

	@RequestMapping(value = "/candidateList", method = RequestMethod.GET)
	@ResponseBody
	public List<Candidate> candidateListByEstablishment() {
		return candidateService.candidateListByEstablishment();
	}
	
	@RequestMapping(value = "/candidate/byid", method = RequestMethod.GET)
	@ResponseBody
	public List<Candidate> candidateListByID(@RequestParam("canId") int canID) {
		return candidateRepository.findAllBycandidateId(canID);
	}
		
}
