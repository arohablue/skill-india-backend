package com.skillindia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillindia.datajpa.course.model.Course;
import com.skillindia.datajpa.course.service.CourseService;

@Controller
public class CourseController {
	
		@Autowired
		CourseService courseService;
		
		public void setCourseServiceObject(CourseService courseServiceObject) {
			this.courseService = courseServiceObject;
		}
		
		@RequestMapping(value = "/addcourse", method = RequestMethod.POST)
		@CrossOrigin
		public String  addCandidate (@RequestBody Course course) {
			
			
			courseService.addCourse(course);
			return "records added successfully";
		}
		
		

}
