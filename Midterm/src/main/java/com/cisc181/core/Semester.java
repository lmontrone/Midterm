package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Semester {
	public UUID semesterId;
	
	public Semester(){
		this.semesterId = UUID.randomUUID();
	}
	public ArrayList<Course> Courses = new ArrayList<Course>();
	
	public void addCourses(Course course){
		Courses.add(course);
	}
	public UUID GetId(){
		return semesterId;
	}
}
