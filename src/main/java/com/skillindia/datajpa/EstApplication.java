package com.skillindia.datajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "tbl_canApp")
@Entity
public class EstApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appId;
	
	@Column
	private String estId;

	@Column
	private String canId;

}
