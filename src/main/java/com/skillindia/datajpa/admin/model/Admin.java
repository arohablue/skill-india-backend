package com.skillindia.datajpa.admin.model;


import java.io.Serializable;
import java.sql.Date;

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

@Entity
@Table(name = "tbl_admin")
public class Admin  implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int adminId;
		
		private String adminName;

		@Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String adminContactNumber;
		
		 @OneToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
		 @JoinColumn(name = "account_id")
		 @JsonIgnore
		 private Account account;

		public int getAdminId() {
			return adminId;
		}
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		private String adminGender;

		private String adminEmaiIId;
		
		
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminContactNumber() {
			return adminContactNumber;
		}
		public void setAdminContactNumber(String adminContactNumber) {
			this.adminContactNumber = adminContactNumber;
		}
		public String getAdminGender() {
			return adminGender;
		}
		public void setAdminGender(String adminGender) {
			this.adminGender = adminGender;
		}
		public String getAdminEmaiIId() {
			return adminEmaiIId;
		}
		public void setAdminEmaiIId(String adminEmaiIId) {
			this.adminEmaiIId = adminEmaiIId;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Admin(int adminId, String adminName,
				@NotEmpty(message = "Phone Number cannot be empty!") @Size(max = 10, min = 10, message = "Phone Number Should be 10 number long") String adminContactNumber,
				String adminGender, String adminEmaiIId) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminContactNumber = adminContactNumber;
			this.adminGender = adminGender;
			this.adminEmaiIId = adminEmaiIId;
		}
		
		public Admin() {
			
		}

}




