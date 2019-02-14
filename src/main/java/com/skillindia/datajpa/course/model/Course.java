package com.skillindia.datajpa.course.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="tbl_course")
@Entity
public class Course {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	private int courseId;
	private String courseName;
	private String courseDescription;
	private int courseDuration;
	
	private String traineeName;
	private int courseAmount;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId")
    private Course course;
	
	public Course() {
		super();
	}

	public Course(int courseId, String courseName, String courseDescription, int courseDuration, String traineeName,
			int courseAmount) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseDuration = courseDuration;
		this.traineeName = traineeName;
		this.courseAmount = courseAmount;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public int getCourseAmount() {
		return courseAmount;
	}

	public void setCourseAmount(int courseAmount) {
		this.courseAmount = courseAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseDuration=" + courseDuration + ", traineeName=" + traineeName
				+ ", courseAmount=" + courseAmount + "]";
	}
	
	

}
