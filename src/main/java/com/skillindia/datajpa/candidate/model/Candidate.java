package com.skillindia.datajpa.candidate.model;

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
		private int candidateUserId;
		
//		@Column(unique=true)
//		private String estUserId;
		
		private String candidateName;
		
		private String candidateFatersName;
		
		private String candidateNewPassword;
		
		
		@Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String candidateContactNumber;

		private String candidateGender;
		
		private String candidateAdharNumber;
		
		private String candidateEmaiIId;
		
		private String candidateEducationDetails;
		
		private Date candidateDoB;
		
		private String candidateRequestStatus="PENDING";
		
		private String candidateCourseStatus;

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

		public String getCandidateFatersName() {
			return candidateFatersName;
		}

		public void setCandidateFatersName(String candidateFatersName) {
			this.candidateFatersName = candidateFatersName;
		}
		
		public String getCandidateAdharNumber() {
			return candidateAdharNumber;
		}

		public void setCandidateAdharNumber(String candidateAdharNumber) {
			this.candidateAdharNumber = candidateAdharNumber;
		}

		public String getCandidateNewPassword() {
			return candidateNewPassword;
		}

		public void setCandidateNewPassword(String candidateNewPassword) {
			this.candidateNewPassword = candidateNewPassword;
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

		

		public String getCandidateEmaiIId() {
			return candidateEmaiIId;
		}

		public void setCandidateEmaiIId(String candidateEmaiIId) {
			this.candidateEmaiIId = candidateEmaiIId;
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
		@Override
		public String toString() {
			return "Candidate [candidateUserId=" + candidateUserId 
					+", candidateNewPassword=" + candidateNewPassword
					+ ", candidateName=" + candidateName 
					+", candidateFatersName=" + candidateFatersName
					+ ", candidateContactNumber=" + candidateContactNumber
					+ ", candidateAdharNumber=" + candidateAdharNumber 
					+ ", candidateEmaiIId=" + candidateEmaiIId
					+  ", candidateCourseStatus=" + candidateCourseStatus 
					+", candidateDoB=" + candidateDoB+
					", candidateRequestStatus=" +candidateRequestStatus+"]";
}
}
