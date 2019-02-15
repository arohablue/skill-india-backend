package com.skillindia.datajpa.candidate.repository;



import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.model.Candidate;


public interface CandidateRepository extends CrudRepository<Candidate, Long>{
	
	List<Candidate> findAll();
	
}
