package com.skillindia.datajpa.candidate.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.model.Candidate;

//import com.skillindia.datajpa.candidate.candidateModel.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
	
	Candidate findBycandidateUserId(Long id);
	Candidate findBycandidateEmaiIId(Long id);
	Candidate findBycandidateUserIdAndCandidateNewPassword( 
			@Param("candidateUserId") String candidateUserId, @Param("candidateNewPassword") String candidateNewPassword);
	//List<Candidate> findByDomain(String domain);
	Candidate findBycandidateUserIdAndCandidatePassword(@Param("candidateUserId") String candidateUserId,
			@Param("candidatePassword") String candidatePassword);
}
