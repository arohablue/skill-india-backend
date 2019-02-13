package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.candidate.candidateModel.Candidate;
import com.skillindia.datajpa.candidate.candidateService.CandidateService;

@Controller
public class CandidateController {

	@Autowired
	CandidateService candidateService;

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateService = candidateServiceObject;
	}

	@RequestMapping(value = "/addCandidate", method = RequestMethod.POST)
	@CrossOrigin
	public String addCandidate(@RequestBody Candidate candidate) {
		
		candidateService.addCandidate(candidate);
		return "records added successfully";
	}

	@RequestMapping(value = "/loginCandidate", method = RequestMethod.GET)
	@CrossOrigin
	@ResponseBody
	public String loginCandidate(@RequestParam(name = "username") String userId,
			@RequestParam(name = "password") String password) {
		if (candidateService.login(userId, password) != null) {
			return "1";
		}
		return "0";
	}
}
