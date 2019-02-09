package com.skillindia.datajpa.establishment.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.skillindia.datajpa.establishment.repository.Establishment;

@Repository
public class EstablishmentDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void  addEstablishment(Establishment est) {
		entityManager.persist(est);
	}
	
}
