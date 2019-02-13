package com.skillindia.datajpa.address.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Table(name="tbl_addressdetails")
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
	@SequenceGenerator(name = "address_sequence", sequenceName = "address_sequence")
	@Column
	private int addressId;

	@Column
	@NotEmpty(message = "Address cannot be empty")
	private String localAddress;
	
	@Column
	@NotEmpty(message = "City cannot be empty!")
	private String city;

	@Column
	private String state;

	public Address() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", localAddress=" + localAddress + ", city=" + city + ", state="
				+ state + "]";
	}
}
