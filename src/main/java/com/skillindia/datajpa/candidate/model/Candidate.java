package com.skillindia.datajpa.candidate.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skillindia.datajpa.Account;
import com.skillindia.datajpa.address.model.Address;
import com.skillindia.datajpa.bankdetails.model.BankDetails;

@Entity
@Table(name = "tbl_candidate")
public class Candidate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int candidateId;

	@Column(unique = true)
	private String candidateName;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	@JsonIgnore
	private Account account;

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "candidate", cascade = CascadeType.ALL)
	private BankDetails bankDetails;

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "candidate", cascade = CascadeType.ALL)
	private Address address;

	@Column
	@NotEmpty(message = "Phone Number cannot be empty!")
	@Size(max = 10, min = 10, message = "Phone Number Should be 10 number long")
	private String candidateContactNumber;

	private String candidateGender;

	private String candidateAadhaarNumber;

	private String candidateEmaiI;

	private String candidateEducationDetails;

	private Date candidateDoB;

	private String candidateRequestStatus = "PENDING";

	private String candidateCourseStatus;

	public Candidate() {

	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@JsonIgnore
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getCandidateContactNumber() {
		return candidateContactNumber;
	}

	public void setCandidateContactNumber(String candidateContactNumber) {
		this.candidateContactNumber = candidateContactNumber;
	}

	public String getCandidateGender() {
		return candidateGender;
	}

	public void setCandidateGender(String candidateGender) {
		this.candidateGender = candidateGender;
	}

	public String getCandidateAadhaarNumber() {
		return candidateAadhaarNumber;
	}

	public void setCandidateAadhaarNumber(String candidateAadhaarNumber) {
		this.candidateAadhaarNumber = candidateAadhaarNumber;
	}

	public String getCandidateEmaiI() {
		return candidateEmaiI;
	}

	public void setCandidateEmaiI(String candidateEmaiI) {
		this.candidateEmaiI = candidateEmaiI;
	}

	public String getCandidateEducationDetails() {
		return candidateEducationDetails;
	}

	public void setCandidateEducationDetails(String candidateEducationDetails) {
		this.candidateEducationDetails = candidateEducationDetails;
	}

	public Date getCandidateDoB() {
		return candidateDoB;
	}

	public void setCandidateDoB(Date candidateDoB) {
		this.candidateDoB = candidateDoB;
	}

	public String getCandidateRequestStatus() {
		return candidateRequestStatus;
	}

	public void setCandidateRequestStatus(String candidateRequestStatus) {
		this.candidateRequestStatus = candidateRequestStatus;
	}

	public String getCandidateCourseStatus() {
		return candidateCourseStatus;
	}

	public Candidate(int candidateId, String candidateName, Account account,
			@NotEmpty(message = "Phone Number cannot be empty!") @Size(max = 10, min = 10, message = "Phone Number Should be 10 number long") String candidateContactNumber,
			String candidateGender, String candidateAadhaarNumber, String candidateEmaiI,
			String candidateEducationDetails, Date candidateDoB, String candidateRequestStatus,
			String candidateCourseStatus, BankDetails bankDetails, Address address) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.account = account;
		this.candidateContactNumber = candidateContactNumber;
		this.candidateGender = candidateGender;
		this.candidateAadhaarNumber = candidateAadhaarNumber;
		this.candidateEmaiI = candidateEmaiI;
		this.candidateEducationDetails = candidateEducationDetails;
		this.candidateDoB = candidateDoB;
		this.candidateRequestStatus = candidateRequestStatus;
		this.candidateCourseStatus = candidateCourseStatus;
		this.bankDetails = bankDetails;
		this.address = address;
	}

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

	public void setCandidateCourseStatus(String candidateCourseStatus) {
		this.candidateCourseStatus = candidateCourseStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", account=" + account
				+ ", bankDetails=" + bankDetails + ", address=" + address + ", candidateContactNumber="
				+ candidateContactNumber + ", candidateGender=" + candidateGender + ", candidateAadharNumber="
				+ candidateAadhaarNumber + ", candidateEmaiI=" + candidateEmaiI + ", candidateEducationDetails="
				+ candidateEducationDetails + ", candidateDoB=" + candidateDoB + ", candidateRequestStatus="
				+ candidateRequestStatus + ", candidateCourseStatus=" + candidateCourseStatus + "]";
	}

}
