package com.skillindia.datajpa.course;

import javax.persistence.Column;
import javax.persistence.Id;

public class Course {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	private int courseId;
	private String courseName;
	private String courseDescription;
	private int courseDuration;
	
	@Column
    private int establishmentId;
	
	@Column
    private String requestStatus;

}
