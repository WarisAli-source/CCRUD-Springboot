package com.example.springproject.service;

import java.util.List;

import com.example.springproject.entities.Course;

public interface CourseService {
	public List<Course> getCourses(); 
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);

}
