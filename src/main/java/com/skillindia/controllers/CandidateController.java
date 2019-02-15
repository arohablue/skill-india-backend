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
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.service.CandidateService;
import com.skillindia.datajpa.message.model.Message;

@RestController
@CrossOrigin
public class CandidateController {

	@Autowired
	CandidateService candidateService;
	LoginRepository loginRepository;

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateService = candidateServiceObject;
	}

	@RequestMapping(value = "/candidate/register", method = RequestMethod.POST)
	public Message  candidateRegister(@RequestBody Account acc) {
		candidateService.addCandidate(acc);
		return new Message("hello from");
	} 
	

	@RequestMapping(value = "/candidateList", method = RequestMethod.GET)
	@ResponseBody
	public List<Candidate> candidateListByEstablishment() {
		return candidateService.candidateListByEstablishment();
	}
}
