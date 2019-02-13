package com.skillindia.datajpa.candidate.candidateModel;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_candidate")
public class Candidate implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(unique=true)
		private int candidateUserId;
		
		private String candidateName;
		
		private String candidateFatherName;
		
		private String candidatePassword;
		
		
		@Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String candidateContactNumber;

		private String candidateGender;
		
		@Column(unique=true)
		private String candidateAadharNumber;
		
		@Column(unique=true)
		private String candidateEmail;
		
		private String candidateEducationDetails;
		
		private Date candidateDoB;
		
		private String candidateRequestStatus="PENDING";
		
		private String candidateCourseStatus;
		
		public String getCandidateFatherName() {
			return candidateFatherName;
		}

		public void setCandidateFatherName(String candidateFatherName) {
			this.candidateFatherName = candidateFatherName;
		}

		public String getCandidatePassword() {
			return candidatePassword;
		}

		public void setCandidatePassword(String candidatePassword) {
			this.candidatePassword = candidatePassword;
		}

		public String getCandidateAadharNumber() {
			return candidateAadharNumber;
		}

		public void setCandidateAadharNumber(String candidateAadharNumber) {
			this.candidateAadharNumber = candidateAadharNumber;
		}

		public int getCandidateUserId() {
			return candidateUserId;
		}

		public void setCandidateUserId(int candidateUserId) {
			this.candidateUserId = candidateUserId;
		}

		public String getCandidateName() {
			return candidateName;
		}

		public void setCandidateName(String candidateName) {
			this.candidateName = candidateName;
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

		public void setCandidateCourseStatus(String candidateCourseStatus) {
			this.candidateCourseStatus = candidateCourseStatus;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		public String getCandidateEmail() {
			return candidateEmail;
		}

		public void setCandidateEmail(String candidateEmail) {
			this.candidateEmail = candidateEmail;
		}

		@Override
		public String toString() {
			return "Candidate [candidateUserId=" + candidateUserId + ", candidateName=" + candidateName
					+ ", candidateFatherName=" + candidateFatherName + ", candidatePassword=" + candidatePassword
					+ ", candidateContactNumber=" + candidateContactNumber + ", candidateGender=" + candidateGender
					+ ", candidateAadharNumber=" + candidateAadharNumber + ", candidateEmail=" + candidateEmail
					+ ", candidateEducationDetails=" + candidateEducationDetails + ", candidateDoB=" + candidateDoB
					+ ", candidateRequestStatus=" + candidateRequestStatus + ", candidateCourseStatus="
					+ candidateCourseStatus + "]";
		}
}
