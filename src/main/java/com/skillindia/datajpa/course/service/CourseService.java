package com.skillindia.datajpa.course.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillindia.datajpa.course.model.Course;
import com.skillindia.datajpa.course.repository.CourseRepository;

@Service
public class CourseService {

		@Autowired
		private CourseRepository impl;
		
		public void addCourse(Course course) {
				impl.save(course);
		}
		
		
	

}
