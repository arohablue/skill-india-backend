package com.skillindia.datajpa.establishment.Account.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_establishmentAccount")
public class AccountEstablishment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(unique=true)
	private String estUserId;
	
	private String estUserPassword;
	public String getEstUserId() {
		return estUserId;
	}

	public void setEstUserId(String estUserId) {
		this.estUserId = estUserId;
	}

	public String getEstUserPassword() {
		return estUserPassword;
	}

	public void setEstUserPassword(String estUserPassword) {
		this.estUserPassword = estUserPassword;
	}

	@Override
	public String toString() {
		return "account [estUserId=" + estUserId + ", estUserPassword=" + estUserPassword + "]";
	}

}
