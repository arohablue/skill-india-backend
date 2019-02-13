package com.skillindia.datajpa.course.repository;

import org.springframework.data.repository.CrudRepository;

import com.skillindia.datajpa.course.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
				
Course findByCourseId(Long id);
Course findByCourseName(String name);
Course findByCourseDescription(String description);
Course findByCourseDuration(Long duration);
Course findByTraineeName(String Tname);
Course findByCourseAmount(Long amount);

		}



