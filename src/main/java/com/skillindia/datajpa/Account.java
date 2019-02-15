package com.skillindia.datajpa;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;

@Entity
@Table(name = "tbl_Account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;

	private String username;

	private String password;

	@OneToMany(mappedBy = "account",cascade= CascadeType.ALL)
	private List<Candidate> candidates;
	
	@OneToMany(mappedBy = "account",cascade= CascadeType.ALL)
	private List<Establishment> establishments;
	
	@OneToMany(mappedBy = "account",cascade= CascadeType.ALL)
	private List<Admin> accounts;

	public List<Establishment> getEstablishments() {
		return establishments;
	}

	public void setEstablishments(List<Establishment> establishments) {
		this.establishments = establishments;
	}

	public List<Admin> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Admin> accounts) {
		this.accounts = accounts;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	public Account(int accountId, String username, String password, List<Candidate> candidates) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.candidates = candidates;
	}

	public Account() {

	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password + ", candidates="
				+ candidates + ", establishments=" + establishments + "]";
	}
	

}
