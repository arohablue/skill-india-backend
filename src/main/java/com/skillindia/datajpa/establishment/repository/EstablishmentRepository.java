package com.skillindia.datajpa.establishment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.establishment.model.Establishment;

public interface EstablishmentRepository extends CrudRepository<Establishment, Long> {
	
	Establishment findByestId(Long id);
	Establishment findByEstUserId(Long id);
	Establishment findByestEmaiIId(Long id);
	Establishment findByEstUserIdAndEstUserPassword( 
			@Param("EstUserId") String EstUserId, @Param("EstUserPassword") String EstPassword);
     
}
