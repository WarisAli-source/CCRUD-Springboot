package com.example.springproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springproject.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	
	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Course","Java Basic Course For Beginnerss"));
		list.add(new Course(146,"C++ Course","C++ Basic Course For Beginnerss"));
		list.add(new Course(147,"Pyhton Course","Python Basic Course For Beginnerss"));
		list.add(new Course(148,"Sprigboot Course","Springboot Basic Course For Beginnerss"));
		list.add(new Course(149,"React Course","React Basic Course For Beginnerss"));

		
	}
	@Override
	public List<Course> getCourses() {

		return list;
	}
	

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course: list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
		
	}
	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e-> {
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
				
			}
		});
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		
		list= list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
	
	
}
