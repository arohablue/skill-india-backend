package com.skillindia.datajpa;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.skillindia.datajpa.admin.model.Admin;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;

@Entity
@Table(name = "tbl_Account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;

	@Column(unique=true)
	private String username;

	private String password;

	@OneToOne(mappedBy = "account",cascade= CascadeType.ALL)
	private Candidate candidate;
	
	@OneToOne(mappedBy = "account",cascade= CascadeType.ALL)
	private Establishment establishment;
	
	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@OneToOne(mappedBy = "account",cascade= CascadeType.ALL)
	private Admin admin;

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



	public Account(int accountId, String username, String password, Candidate candidate, Establishment establishment,
			Admin admin) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.candidate = candidate;
		this.establishment = establishment;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password + ", candidate="
				+ candidate + ", establishment=" + establishment + ", admin=" + admin + "]";
	}

	public Account() {

	}

}
