package com.skillindia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.CandApplication;

public interface CanApplnRepo extends  CrudRepository<CandApplication, Long> {
	List<CandApplication> findAllByestId(String estID);
	List<CandApplication> findAllBycanId(String estID);
	List<CandApplication> findAllByestIdAndCanId(String estID, String candId);

}
