package com.skillindia.datajpa.candidate.candidateRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.candidateModel.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {

	/*
	 * Candidate findBycandidateUserId(Long id); Candidate findBycandidateEmail(Long
	 * id);
	 */

	Candidate findBycandidateUserIdAndCandidatePassword(@Param("candidateUserId") String candidateUserId,
			@Param("candidatePassword") String candidatePassword);

}
