package com.skillindia.datajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tbl_documents")
@Entity
public class Document {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique=true)
	private int documentId;
	private String documentName;
	private String documentPath;
	
}
