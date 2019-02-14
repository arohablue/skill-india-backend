package com.skillindia.datajpa.course.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillindia.datajpa.course.model.Course;
import com.skillindia.datajpa.course.repository.CourseRepository;

@Service
public class CourseService {

		@Autowired
		private CourseRepository courseRepository;
		
		public void addCourse(Course course) {
			courseRepository.save(course);
		}
		
		public List<Course> getCourseList(){
			return courseRepository.findAll();
			
		}

}
