package com.skillindia.datajpa.admin.Account.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_adminAccount")
public class account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String adminUserName;
	
	private String adminPassword;

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "account [adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + "]";
	}
	
}
