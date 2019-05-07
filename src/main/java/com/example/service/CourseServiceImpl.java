package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.entity.Course;
import com.example.repository.CourseJpaRepository;

public class CourseServiceImpl implements CourseService{

	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	 
	
	@Override
	public List<Course> listAllCourse() {
	return	courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
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
