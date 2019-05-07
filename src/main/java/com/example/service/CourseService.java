package com.example.service;

import java.util.List;

import com.example.entity.Course;

public interface CourseService {
	
	public abstract List<Course> listAllCourse();
	public abstract Course addCourse(Course course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	
	
	
}
