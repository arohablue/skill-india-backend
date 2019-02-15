package com.skillindia.datajpa.establishment.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.candidate.model.Candidate;



@Entity
@Table(name = "tbl_establishment")
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estId;
	
	private String estName;
	
	 @ManyToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	 @JoinColumn(name = "account_id")
	 @JsonIgnore
	 private Account account;
	 
	 @Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String estContactNumber;

		private String estType;
		
		private String estRegNo;
		
		private String estEmaiIId;
		
		private int workingDays;
		
		private String domain;
		
		private String appStatus="PENDING";
		
		private String estBankDetails;
		
		private String estAddress;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	public int getEstId() {
		return estId;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	
	public String getEstName() {
		return estName;
	}

	public void setEstName(String estName) {
		this.estName = estName;
	}

	public String getEstContactNumber() {
		return estContactNumber;
	}

	public void setEstContactNumber(String estContactNumber) {
		this.estContactNumber = estContactNumber;
	}

	public String getEstType() {
		return estType;
	}

	public void setEstType(String estType) {
		this.estType = estType;
	}

	public String getEstRegNo() {
		return estRegNo;
	}

	public void setEstRegNo(String estRegNo) {
		this.estRegNo = estRegNo;
	}

	public String getEstEmaiIId() {
		return estEmaiIId;
	}

	public void setEstEmaiIId(String estEmaiIId) {
		this.estEmaiIId = estEmaiIId;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getEstBankDetails() {
		return estBankDetails;
	}

	public void setEstBankDetails(String estBankDetails) {
		this.estBankDetails = estBankDetails;
	}

	public String getEstAddress() {
		return estAddress;
	}

	public void setEstAddress(String estAddress) {
		this.estAddress = estAddress;
	}

	
	public Establishment(int estId, String estUserId, String estUserPassword, String estName, Account account,
			@NotEmpty(message = "Phone Number cannot be empty!") @Size(max = 10, min = 10, message = "Phone Number Should be 10 number long") String estContactNumber,
			String estType, String estRegNo, String estEmaiIId, int workingDays, String domain, String appStatus,
			String estBankDetails, String estAddress, Candidate candidate) {
		super();
		this.estId = estId;
		this.estName = estName;
		this.account = account;
		this.estContactNumber = estContactNumber;
		this.estType = estType;
		this.estRegNo = estRegNo;
		this.estEmaiIId = estEmaiIId;
		this.workingDays = workingDays;
		this.domain = domain;
		this.appStatus = appStatus;
		this.estBankDetails = estBankDetails;
		this.estAddress = estAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Establishment() {}
	
}

