package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.LoginRepository;
import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.admin.respository.adminrepository;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.candidate.repository.CandidateRepository;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.establishment.repository.EstablishmentRepository;
import com.skillindia.datajpa.message.model.Message;

@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private CandidateRepository candRepository;
	@Autowired
	private EstablishmentRepository estabRepository;
	@Autowired
	private adminrepository adminrepo;

	@RequestMapping(value = "/account/add", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Account addAccount(@RequestBody Account acc) {
		Account acct = loginRepository.save(acc);
		return acct;
	}

	@RequestMapping(value = "/user/check", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Message userCheck(@RequestParam("username") String username) {
		System.out.println(username);
		Account acc = loginRepository.findByusername(username);
		if (acc != null) {
			return new Message("true");
		}
		return new Message("false");
	}

	@RequestMapping(value = "admin/login", method = RequestMethod.POST)
	@ResponseBody
	public Admin adminLogin(@RequestBody Account acc) {

		Account dacc = loginRepository.findByusernameAndPassword(acc.getUsername(), acc.getPassword());

		if (dacc == null) {
			return null;
		}

		Admin addc = adminrepo.findByAccount(dacc);
		System.out.println();
		if (addc != null) {
			return addc;
		}
		return null;
	}

	@RequestMapping(value = "candidate/login", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Candidate candtLogin(@RequestBody Account acc) {

		Account dacc = loginRepository.findByusernameAndPassword(acc.getUsername(), acc.getPassword());
		if (dacc == null) {
			return null;
		}

		Candidate cc = candRepository.findByAccount(dacc);

		if (cc != null) {
			return cc;
		}
		return null;
	}

	@RequestMapping(value = "establishment/login", method = RequestMethod.POST)
	@ResponseBody
	public Establishment estabLogin(@RequestBody Account acc) {
		System.out.println(acc);
		Account dacc = loginRepository.findByusernameAndPassword(acc.getUsername(), acc.getPassword());

		if (dacc == null) {
			return null;
		}
		Establishment ecc = estabRepository.findByAccount(dacc);
		if (ecc != null) {
			return ecc;
		}
		return null;
	}

}
