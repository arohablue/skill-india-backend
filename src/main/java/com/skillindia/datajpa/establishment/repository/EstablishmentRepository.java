package com.skillindia.datajpa.establishment.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.candidate.model.Candidate;

import com.skillindia.datajpa.establishment.model.Establishment;

public interface EstablishmentRepository extends CrudRepository<Establishment, Long> {
	List<Establishment> findAll();
	Establishment findByAccount(Account acc);
	List<Candidate> findAllByestId(int Id);
	
}
