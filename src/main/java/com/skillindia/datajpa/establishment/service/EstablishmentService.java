package com.skillindia.datajpa.establishment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.bankdetails.model.BankDetails;
import com.skillindia.datajpa.candidate.model.Candidate;

import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.repository.EstablishmentRepository;

@Service
public class EstablishmentService {
	 
	@Autowired
	private EstablishmentRepository establishmentRepository;
	@Autowired
	private LoginRepository loginRepository;
	
	public void addEstablishment(Account acc) {
		Establishment est  = acc.getEstablishment();
		est.setAccount(acc);
		Address ad = est.getAddress();
		ad.setEstablishment(est);
		BankDetails bankd = est.getBankDetails();
		bankd.setEstablishment(est);
		loginRepository.save(acc);
	}
	
	public void addEstablishment(Establishment acc) {
		establishmentRepository.save(acc);
	}

	public List<Establishment> getAllEstablishments() {
		return establishmentRepository.findAll();
	}
	
	public List<Establishment> establishmentListByCandidate(Candidate candidate) {
		//return establishmentRepository.findAllByCandidate(candidate);
		return null;
	}

}
