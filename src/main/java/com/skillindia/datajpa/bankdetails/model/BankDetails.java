package com.skillindia.datajpa.bankdetails.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skillindia.datajpa.candidate.model.Candidate;
import com.skillindia.datajpa.establishment.model.Establishment;

@Table(name="tbl_bankdetails")
@Entity
public class BankDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	// declaration
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_sequence")
	@SequenceGenerator(name = "bank_sequence", sequenceName = "bank_sequence")
	@Column(name = "bankId", unique = false, nullable = true)
	private int bankId;

	private String bankName;// Bank-Name
	private String bankBranch;// Bank-Branch
	private String bankIFSC;// IFSC code of the bank
	private String accountNumber;// Account Number of the user
	
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

	 @OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	 @JoinColumn(name = "candidate_id")
	 @JsonIgnore
	private Candidate candidate;
	
	 @OneToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	 @JoinColumn(name = "establishment_id")
	 @JsonIgnore
	private Establishment establishment;
	
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", bankIFSC="
				+ bankIFSC + ", accountNumber=" + accountNumber + ", candidate=" + candidate + ", establishment="
				+ establishment + "]";
	}
	
}
