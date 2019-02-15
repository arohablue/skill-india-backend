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
import com.skillindia.datajpa.candidate.service.CandidateService;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.message.model.Message;

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
	public Message loginEstablishment(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (candidateService.login(username, password) != null) {
			return new Message("success");
		}
		return new Message("failure");
	}
	
	@RequestMapping(value = "/candidateList", method = RequestMethod.GET)
	@CrossOrigin
	@ResponseBody
	public List<Candidate> candidateListByEstablishment() {
		return candidateService.candidateListByEstablishment();
	}
}
