package com.skillindia.datajpa.candidate.repository;


<<<<<<< HEAD:src/main/java/com/skillindia/datajpa/candidate/repository/CandidateRepository.java

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.model.Candidate;
=======
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.candidateModel.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
>>>>>>> develop:src/main/java/com/skillindia/datajpa/candidate/candidateRepository/CandidateRepository.java

	/*
	 * Candidate findBycandidateUserId(Long id); Candidate findBycandidateEmail(Long
	 * id);
	 */

<<<<<<< HEAD:src/main/java/com/skillindia/datajpa/candidate/repository/CandidateRepository.java
public interface CandidateRepository extends CrudRepository<Candidate, Long>{
	
	Candidate findBycandidateUserId(Long id);
	Candidate findBycandidateEmaiIId(Long id);
	Candidate findBycandidateUserIdAndCandidateNewPassword( 
			@Param("candidateUserId") String candidateUserId, @Param("candidateNewPassword") String candidateNewPassword);
	//List<Candidate> findByDomain(String domain);
=======
	Candidate findBycandidateUserIdAndCandidatePassword(@Param("candidateUserId") String candidateUserId,
			@Param("candidatePassword") String candidatePassword);

>>>>>>> develop:src/main/java/com/skillindia/datajpa/candidate/candidateRepository/CandidateRepository.java
}
