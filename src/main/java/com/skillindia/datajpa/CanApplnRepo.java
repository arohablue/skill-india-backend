package com.skillindia.datajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CanApplnRepo extends  CrudRepository<CandApplication, Long> {
	List<CandApplication> findAllByestId(int estID);
	List<CandApplication> findAllBycanId(int estID);
	CandApplication findBycanId(int estID );
	CandApplication findByestId(int estID );
	List<CandApplication> findAllByestIdAndCanId(int estID, int candId);

}
