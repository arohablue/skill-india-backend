package com.skillindia.datajpa.candidate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;

@Service
@Transactional
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private LoginRepository loginRepository;

	public Account addCandidate(Account acc) {
		Candidate cnd = acc.getCandidate();
		cnd.setAccount(acc);
		Address add = cnd.getAddress();
		add.setCandidate(cnd);
		Account  ac =loginRepository.save(acc);
		return ac;

	}

	public void addCandidate(Candidate cc) {
		Address add = cc.getAddress();
		add.setCandidate(cc);
		candidateRepository.save(cc);
	}

	public List<Candidate> candidateListByEstablishment() {
		return candidateRepository.findAll();

	}

}
