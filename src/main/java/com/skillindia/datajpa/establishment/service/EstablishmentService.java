package com.skillindia.datajpa.establishment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.repository.EstablishmentRepository;

@Service
public class EstablishmentService {
	
	@Autowired
	private EstablishmentRepository impl;
	
	public void addEstablishment(Establishment est) {
			impl.save(est);
	}
	
<<<<<<< HEAD
	public Establishment login(String username , String Password) {
		Establishment est = impl.findByestUserIdAndEstUserPassword(username, Password);
=======
	public Establishment login(String userId , String password) {
		Establishment est = impl.findByEstUserIdAndEstUserPassword(userId, password);
>>>>>>> develop
		return est;
	}

	public void dashboardDetails(Establishment est) {
		impl.findAll();
	}

}
