package com.skillindia.datajpa.establishment.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tbl_establishment")
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estId;
	
	@Column(unique=true)
	private String estUserId;
	
	private String estUserPassword;
	
	private String estName;
	
	@Column
	@NotEmpty(message = "Phone Number cannot be empty!")
	@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
	private String estContactNumber;

	private String estType;
	
	private String estRegNo;
	
	private String estEmail;
	
	private int estWorkingDays;
	
	private String domain;
	
	private String appStatus="PENDING";
	
	private String estBankDetails;
	
	private String estAddress;
	
	
	public int getEstId() {
		return estId;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	public String getEstUserId() {
		return estUserId;
	}

	public void setEstUserId(String estUserId) {
		this.estUserId = estUserId;
	}

	public String getEstUserPassword() {
		return estUserPassword;
	}

	public void setEstUserPassword(String estUserPassword) {
		this.estUserPassword = estUserPassword;
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

	public int getEstWorkingDays() {
		return estWorkingDays;
	}

	public void setEstWorkingDays(int estWorkingDays) {
		this.estWorkingDays = estWorkingDays;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Establishment [estId=" + estId + ", estUserId=" + estUserId + ", estUserPassword=" + estUserPassword
				+ ", estName=" + estName + ", estContactNumber=" + estContactNumber + ", estType=" + estType
				+ ", estRegNo=" + estRegNo + ", estEmaiI=" + estEmail + ", estWorkingDays=" + estWorkingDays
				+ ", domain=" + domain + ", appStatus=" + appStatus + ", estBankDetails=" + estBankDetails
				+ ", estAddress=" + estAddress + "]";
	}

	public String getEstEmail() {
		return estEmail;
	}

	public void setEstEmail(String estEmail) {
		this.estEmail = estEmail;
	}
	
	
	
}

