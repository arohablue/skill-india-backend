package com.skillindia.datajpa.establishment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.skillindia.datajpa.establishment.Account.model.AccountEstablishment;
import com.skillindia.datajpa.candidate.model.Candidate;

import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.repository.EstablishmentRepository;

@Service
public class EstablishmentService {
	 
	@Autowired
	private EstablishmentRepository establishmentRepository;
	
	
	public void addEstablishment(Establishment est) {

		establishmentRepository.save(est); 				

	}
	
	
	public Establishment login(String username , String Password) {

		Establishment est = establishmentRepository.findByEstUserIdAndEstUserPassword(username, Password);
		return est;
	}

	public List<Establishment> getAllEstablishments() {
		return establishmentRepository.findAll();
	}
	
	public List<Establishment> establishmentListByCandidate(Candidate candidate) {
		return establishmentRepository.findAllByCandidate(candidate);
	}

}
