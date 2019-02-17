package com.skillindia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.CandApplication;
import com.skillindia.datajpa.EstApplication;

public interface EstApplnRepo extends  CrudRepository<EstApplication, Long> {
	List<EstApplication> findAllByestId(String estID);
	List<EstApplication> findAllBycanId(String estID);
	List<EstApplication> findAllByestIdAndCanId(String estID, String candId);

}
