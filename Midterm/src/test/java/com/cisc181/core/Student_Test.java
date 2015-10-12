package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	ArrayList<Student> ListofStudents = new ArrayList<Student>();
	ArrayList<Course> ListofCourses = new ArrayList<Course>();
	ArrayList<Semester> ListofSemesters = new ArrayList<Semester>();
	ArrayList<Section> ListofSections = new ArrayList<Section>();
	
	@BeforeClass{	
	Enrollment enrollment = new Enrollment();
	
	Semester Fall = new Semester();
	Semester Spring = new Semester();
	
	ListofSemesters.add(Fall);
	ListofSemesters.add(Spring);
	
	Date jennyDate = new Date(1990, 4, 4);
	Date michelleDate = new Date(1985, 6, 20);
	Date larsDate = new Date(1990, 11, 11);
	Date anthonyDate = new Date(1997, 1, 21);
	Date margeDate = new Date(1993, 4, 14);
	Date harryDate = new Date(1991, 7, 8);
	Date jamesDate = new Date(1990, 10, 5);
	Date samDate = new Date(1995, 0, 5);
	Date johnDate = new Date(1994, 8, 6);
	Date loganDate = new Date(1996, 7, 7);

	Student Jenny = new Student("Jenny", "Parker", "Larrabee", jennyDate, eMajor.BUSINESS, "10 Lousy Ln.", "9781234567","jLarrabee@udel.edu");
	Student Michelle = new Student("Michelle", "Gray", "Habernathy", michelleDate, eMajor.COMPSI, "12 South College", "9782345678", "mHabernathy@udel.edu");
	Student Lars = new Student("Lars", "James", "Drinkwater", larsDate, eMajor.CHEM, "3 Squalor Circle", "9783456789", "lDrinkwater@udel.edu");
	Student Anthony = new Student("Anthony", "Patrick", "Chase", anthonyDate, eMajor.PHYSICS, "4 Squalor Circle", "9781235678","achase@udel.edu");
	Student Marge = new Student("Marge", "Lilian", "Matthews", margeDate, eMajor.NURSING,"15 Lilac Pond", "9782346789", "mmatthews@udel.edu");
	Student Harry = new Student("Harry", "Michael", "Palmer", harryDate, eMajor.BUSINESS, "2 Drury Ln.", "9784329876", "hpalmer@udel.edu");
	Student James = new Student("James", "Parker", "Costa", jamesDate, eMajor.COMPSI,"5 Squalor Circle", "6874219532","jcosta@udel.edu");
	Student Sam = new Student("Sam", "Phillip", "Hasak", samDate, eMajor.NURSING, "13 Academy St.", "6174235969", "shasak@udel.edu");
	Student John = new Student("John", "Edward", "Benevito", johnDate, eMajor.BUSINESS, "1313 Deadend Drive", "8156304253","jbenevito@udel.edu");
	Student Logan = new Student("Logan", "Jarrett", "Montrone", loganDate, eMajor.CHEM, "40 Main St.", "9786973238", "ljarrett@udel.edu");
	 
	ListofStudents.add(Jenny);
	ListofStudents.add(Michelle);
	ListofStudents.add(Lars);
	ListofStudents.add(Anthony);
	ListofStudents.add(Marge);
	ListofStudents.add(Harry);
	ListofStudents.add(James);
	ListofStudents.add(Sam);
	ListofStudents.add(John);
	ListofStudents.add(Logan);
	
	Course BusinessFinance = new Course(eMajor.BUSINESS, "Business and Finance", 100, UUID.randomUUID());
	Course Dynamics = new Course(eMajor.PHYSICS, "Dynamics", 100, UUID.randomUUID());
	Course OrganicChem = new Course(eMajor.CHEM, "Organic Chemistry", 100, UUID.randomUUID());
	
	ListofCourses.add(BusinessFinance);
	ListofCourses.add(Dynamics);
	ListofCourses.add(OrganicChem);
	}
	
	@Test{
	}
	public void TestChangeMajor()
	{
		Student random = ListofStudents.get(0);
		random.setMajor(eMajor.COMPSI);
		assertEquals(random.getMajor(),eMajor.COMPSI);
		
		}	
	}


