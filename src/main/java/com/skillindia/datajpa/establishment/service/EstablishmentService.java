package com.skillindia.datajpa.establishment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.establishment.model.EstablishmentDao;
import com.skillindia.datajpa.establishment.repository.Establishment;

@Service
public class EstablishmentService {
	
	@Autowired
	private EstablishmentDao estDao;
	
	public void addEstablishment(Establishment est) {
			estDao.addEstablishment(est);
	}

}
