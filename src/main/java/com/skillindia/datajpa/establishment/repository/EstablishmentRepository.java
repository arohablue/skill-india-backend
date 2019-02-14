package com.skillindia.datajpa.establishment.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;

public interface EstablishmentRepository extends CrudRepository<Establishment, Long> {
	
	Establishment findByestId(Long id);
	Establishment findByestUserId(Long id);
	Establishment findByestEmaiIId(@Param("EstUserId") String EmailId);
	Establishment findByestUserIdAndEstUserPassword( 
			@Param("EstUserId") String estUserId, @Param("EstUserPassword") String estPassword);
	List<Establishment> findByDomain(String domain);
	Establishment findByestName(String Name);
	Establishment findByestRegNo(Long Number);
	Establishment findByestContactNumber(Long Number);
	List<Establishment> findByestType(String Type);
	Establishment findByworkingDays(int days);
	Establishment findByAppStatus(String appStatus);
	List<Establishment> findAll();
	List<Establishment> findAllByCandidate(Candidate candidate);
	
}
