package com.skillindia.datajpa.candidate.repository;



import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.model.Candidate;


public interface CandidateRepository extends CrudRepository<Candidate, Long>{
	
	Candidate findBycandidateUserId(Long id);
	Candidate findBycandidateEmaiIId(Long id);
	Candidate findByCandidateUserIdAndCandidatePassword(@Param("candidateUserId") String CandidateUserId, @Param("candidatePassword") String candidatePassword);
	
/*	Candidate findBycandidateUserIdAndCandidateNewPassword( 
			@Param("candidateUserId") String candidateUserId, @Param("candidateNewPassword") String candidateNewPassword);
	//List<Candidate> findByDomain(String domain);*/
}
