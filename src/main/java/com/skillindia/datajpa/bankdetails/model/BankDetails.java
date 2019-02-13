package com.skillindia.datajpa.bankdetails.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class BankDetails {

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
				+ bankIFSC + ", accountNumber=" + accountNumber + "]";
	}
}
