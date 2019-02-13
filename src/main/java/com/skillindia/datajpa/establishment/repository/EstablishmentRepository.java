package com.skillindia.datajpa.establishment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.establishment.model.Establishment;

public interface EstablishmentRepository extends CrudRepository<Establishment, Long> {
	
/*	Establishment findByestId(Long id);
	Establishment findByEstUserId(Long id);
	Establishment findByestEmail(Long id);*/
	
	Establishment findByEstUserIdAndEstUserPassword( 
			@Param("EstUserId") String EstUserId, @Param("EstUserPassword") String EstPassword);
	List<Establishment> findByDomain(String domain);
	
}
