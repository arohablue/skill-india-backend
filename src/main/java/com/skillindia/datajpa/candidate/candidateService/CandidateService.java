package com.skillindia.datajpa.candidate.candidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.candidate.candidateModel.Candidate;
import com.skillindia.datajpa.candidate.candidateRepository.CandidateRepository;


@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository impl;
	
	public void addCandidate(Candidate candidate) {
			impl.save(candidate);
	}
	
	public Candidate login(String username , String Password) {
		Candidate candidate = impl.findBycandidateEmaiIIdAndCandidateNewPassword(username, Password);
	
		return candidate;
	}

}