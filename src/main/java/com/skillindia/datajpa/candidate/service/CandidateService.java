package com.skillindia.datajpa.candidate.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;


@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository impl;
	
	public void addCandidate(Candidate candidate) {
			impl.save(candidate);
	}
	
	public Candidate login(String username , String Password) {
		Candidate candidate = impl.findByCandidateUserIdAndCandidatePassword(username, Password);
		return candidate;
	}

}
