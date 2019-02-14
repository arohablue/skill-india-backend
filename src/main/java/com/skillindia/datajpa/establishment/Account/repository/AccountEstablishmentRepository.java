package com.skillindia.datajpa.establishment.Account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.skillindia.datajpa.establishment.Account.model.AccountEstablishment;
import com.skillindia.datajpa.establishment.model.Establishment;

public interface AccountEstablishmentRepository extends CrudRepository<AccountEstablishment, Long> {
	//AccountEstablishment findByestUserId(Long id);
//	AccountEstablishment findByestUserPassword(String password);
	
	AccountEstablishment findByEstUserIdAndEstUserPassword( 
			@Param("estUserId") String estUserId, @Param("estUserPassword") String estUserPassword);
	//List<Candidate> findByDomain(String domain);*/
}
