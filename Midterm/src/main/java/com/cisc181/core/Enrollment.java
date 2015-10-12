package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID sectionId;
	private UUID studentId;
	private UUID enrollmentId;
	private double grade;
	
	public UUID GetSectionId(){
		return this.sectionId;
	}
	
	public UUID GetStudentId(){
		return this.studentId;
	}
	
	public UUID GetEnrollmentId(){
		return this.enrollmentId;
	}
	
	public double GetGrade(){
		return this.grade;
	}
	
	public void SetSectionId(UUID sectionId){
		this.sectionId = sectionId;
	}
	
	public void SetStudentId(UUID studentId){
		this.studentId = studentId;
	}
	
	public void SetEnrollmentId(UUID enrollmentId){
		this.enrollmentId = enrollmentId;
	}
	
	public void SetGrade(double grade){
		this.grade = grade;
	}
	
	public Enrollment(){
		super();
	}
	
	public Enrollment(UUID studentId, UUID sectionId){
		super();
		this.studentId = studentId;
		this.sectionId = sectionId;
	}
}