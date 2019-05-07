package com.example.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.example.entity.Course;
import com.example.repository.CourseJpaRepository;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

	private static final Log LOG=LogFactory.getLog(CourseServiceImpl.class);
	
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	 
	
	@Override
	public List<Course> listAllCourse() {
LOG.info("Call: "+"listAllCourses()");
	return	courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("Call: "+"addCourse()");
		return courseJpaRepository.save(course);
	}

	@Override
	public int removeCourse(int id) {
		courseJpaRepository.deleteById(id);
return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		courseJpaRepository.save(course);
		return null; 
	}

}
