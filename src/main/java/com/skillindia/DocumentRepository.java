package com.skillindia;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.CandApplication;
import com.skillindia.datajpa.Document;

public interface DocumentRepository  extends  CrudRepository<Document, Long>{
	
}
