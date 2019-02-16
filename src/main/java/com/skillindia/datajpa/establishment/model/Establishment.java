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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.bankdetails.model.BankDetails;
import com.skillindia.datajpa.candidate.model.Candidate;



@Entity
@Table(name = "tbl_establishment")
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estId;
	
	private String estName;
	
	 @OneToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	 @JoinColumn(name = "account_id")
	 @JsonIgnore
	 private Account account;
	 
	 @OneToOne(fetch = FetchType.EAGER,mappedBy = "establishment",cascade= CascadeType.ALL)
	 private BankDetails bankDetails;
	 
	@OneToOne(fetch = FetchType.EAGER,	mappedBy = "establishment",cascade= CascadeType.ALL)
	 private Address address;
	 
	 public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String estContactNumber;

		private String estType;
		
		private String estRegNo;
		
		private String estEmaiI;
		
		private int workingDays;
		
		private String domain;
		
		private String appStatus="PENDING";
		

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

	public String getEstEmaiI() {
		return estEmaiI;
	}

	public void setEstEmaiI(String estEmaiI) {
		this.estEmaiI = estEmaiI;
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


	@Override
	public String toString() {
		return "Establishment [estId=" + estId + ", estName=" + estName + ", account=" + account + ", bankDetails="
				+ bankDetails + ", address=" + address + ", estContactNumber=" + estContactNumber + ", estType="
				+ estType + ", estRegNo=" + estRegNo + ", estEmaiI=" + estEmaiI + ", workingDays=" + workingDays
				+ ", domain=" + domain + ", appStatus=" + appStatus + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Establishment() {}
	
}

