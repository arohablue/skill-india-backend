package com.skillindia.datajpa.candidate.Account.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_candidateAccount")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(unique=true)
	private String accountName;
	private String accountPassword;
	
	
	public Account(String accountName, String accountPassword) {
		super();
		this.accountName = accountName;
		this.accountPassword = accountPassword;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountPassword=" + accountPassword + "]";
	}

	
}
