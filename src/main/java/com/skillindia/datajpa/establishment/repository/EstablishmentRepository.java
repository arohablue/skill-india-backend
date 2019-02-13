package com.skillindia.datajpa.establishment.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.establishment.model.Establishment;

public interface EstablishmentRepository extends CrudRepository<Establishment, Long> {
	
<<<<<<< HEAD
	Establishment findByestId(Long id);
	Establishment findByestUserId(Long id);
	Establishment findByestEmaiIId(Long id);
	Establishment findByestUserIdAndEstUserPassword( 
			@Param("EstUserId") String estUserId, @Param("EstUserPassword") String estPassword);
=======
/*	Establishment findByestId(Long id);
	Establishment findByEstUserId(Long id);
	Establishment findByestEmail(Long id);*/
	
	Establishment findByEstUserIdAndEstUserPassword( 
			@Param("EstUserId") String EstUserId, @Param("EstUserPassword") String EstPassword);
>>>>>>> develop
	List<Establishment> findByDomain(String domain);
	Establishment findByestName(String Name);
	Establishment findByestRegNo(Long Number);
	Establishment findByestContactNumber(Long Number);
	Establishment findByestType(String Type);
	Establishment findByworkingDays(int days);
	Establishment findByAppStatus(String appStatus);
	
	
	
	
	
}
