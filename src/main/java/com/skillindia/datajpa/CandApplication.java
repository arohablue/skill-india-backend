package com.skillindia.datajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tbl_canApp")
@Entity
public class CandApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appId;
	
	private int estId;
	
	private String app_status;
	
	

	public CandApplication(int appId, int estId, String app_status, int canId) {
		super();
		this.appId = appId;
		this.estId = estId;
		this.app_status = app_status;
		this.canId = canId;
	}



	public String getApp_status() {
		return app_status;
	}



	public void setApp_status(String app_status) {
		this.app_status = app_status;
	}



	@Override
	public String toString() {
		return "CandApplication [appId=" + appId + ", estId=" + estId + ", app_status=" + app_status + ", canId="
				+ canId + "]";
	}



	@Column
	private int canId;

	public int getAppId() {
		return appId;
	}

	
	
	public int getEstId() {
		return estId;
	}



	public void setEstId(int estId) {
		this.estId = estId;
	}



	public int getCanId() {
		return canId;
	}



	public void setCanId(int canId) {
		this.canId = canId;
	}



	public void setAppId(int appId) {
		this.appId = appId;
	}



	public CandApplication() {}
}
