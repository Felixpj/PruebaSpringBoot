package com.example.service;

import java.util.List;

import com.example.entity.Course;
import com.example.model.CourseModel;

public interface CourseService {
	
	public abstract List<Course> listAllCourse();
	public abstract Course addCourse(CourseModel course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	
	
	
}
