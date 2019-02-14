package com.skillindia.datajpa.candidate.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;


@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository candidateRepository;
	
	public void addCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
	}
	
	public Candidate login(String username , String Password) {
		Candidate candidate = candidateRepository.findBycandidateUserIdAndCandidateNewPassword(username, Password);
		return candidate;
	}
	
	public List<Candidate> candidateListByEstablishment() {
		return null;
		
	}

}
