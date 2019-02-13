package com.skillindia.datajpa.admin.model;


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
@Table(name = "tbl_admin")
public class Admin  implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int adminId;
		
		private String adminName;
		
		private String adminUserName;
		
		private String adminPassword;
		
		
		@Column
		@NotEmpty(message = "Phone Number cannot be empty!")
		@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
		private String adminContactNumber;

		private String adminGender;

		private String adminEmaiIId;
		

		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
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
		@Override
		public String toString() {
			return "Admin [adminName=" + adminName + ", adminUserName=" + adminUserName + ", adminPassword="
					+ adminPassword + ", adminContactNumber=" + adminContactNumber + ", adminGender=" + adminGender
					+ ", adminEmaiIId=" + adminEmaiIId + "]";
		}
	
}




