package com.skillindia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillindia.datajpa.course.model.Course;
import com.skillindia.datajpa.course.service.CourseService;
import com.skillindia.datajpa.establishment.model.Establishment;
import com.skillindia.datajpa.message.model.Message;

@Controller
@CrossOrigin
public class CourseController {
	
		@Autowired
		CourseService courseService;
		
		public void setCourseServiceObject(CourseService courseServiceObject) {
			this.courseService = courseServiceObject;
		}
		
		@RequestMapping(value = "/addcourse", method = RequestMethod.POST)
		@CrossOrigin
		@ResponseBody
		public Message  addCandidate (@RequestBody Course course) {
			courseService.addCourse(course);
			return new Message("success");
		}
		
		@RequestMapping(value = "/courseList", method = RequestMethod.GET)
		@CrossOrigin
		@ResponseBody
		public List<Course> courseList(@RequestBody Course est) {
			return courseService.getCourseList();
		}
		
		

}
