package com.cisc181.core;
import com.cisc181.eNums.*;

import java.util.ArrayList;
import java.util.UUID;

public class Course {
	public Course(eMajor major, String courseName, int gradePoints, UUID courseId) {
		super();
		Major = major;
		this.courseName = courseName;
		this.gradePoints = gradePoints;
		this.courseId = UUID.randomUUID();
		
	}

	private eMajor Major;
	private String courseName;
	private int gradePoints;
	private UUID courseId;
	private ArrayList<UUID> sectionList;
	
	public void AddSection(UUID sectionId){
		sectionList.add(sectionId);
	}
	
	public eMajor GetMajor(){
		return this.Major;
	}
	
	public String GetCourseName(){
		return this.courseName;
	}
	
	public int GetGradePoints(){
		return this.gradePoints;
	}
	
	public UUID GetCourseId(){
		return this.courseId;
	}
	
	public void SetMajor(eMajor Major){
		this.Major = Major;
	}
	
	public void SetCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public void SetGradePoints(int gradePoints){
		this.gradePoints = gradePoints;
	}
	
	public void SetCourseId(UUID courseId){
		this.courseId = courseId;
	}
}
