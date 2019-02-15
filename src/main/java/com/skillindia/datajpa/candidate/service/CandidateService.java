package com.skillindia.datajpa.candidate.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;


@Service
@Transactional
public class CandidateService {
	
	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private LoginRepository loginRepository;
	
	public void addCandidate(Account acc) {
		for(Candidate o : acc.getCandidates()) {
			o.setAccount(acc);
		}
		loginRepository.save(acc);
		
	}
	
	public void addCandidate(Candidate cc) {
		candidateRepository.save(cc);
	}
	
	public List<Candidate> candidateListByEstablishment() {
		return candidateRepository.findAll();
		
	}

}
