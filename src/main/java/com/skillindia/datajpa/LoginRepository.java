package com.skillindia.datajpa;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends  CrudRepository<Account, Long>{

	Account findByusernameAndPassword(String username, String password);
}
