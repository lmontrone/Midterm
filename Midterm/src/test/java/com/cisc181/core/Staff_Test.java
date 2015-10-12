package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	ArrayList<Staff> ListofStaff = new ArrayList<Staff>();
	
	@BeforeTest{
		
	Date barnabyBDate = new Date(1956, 10, 8);
	Date heatherBDate = new Date(1945, 6, 12);
	Date frankBDate = new Date(1955, 7, 11);
	Date joeBDate = new Date(1951, 6, 6);
	Date harriettBDate = new Date(1950, 0, 14);
	
	Date barnabyHDate = new Date(1980, 9, 12);
	Date heatherHDate = new Date(1993, 10, 1);
	Date frankHDate = new Date(1976, 6, 0);
	Date joeHDate = new Date (1980, 7, 7);
	Date harriettHDate = new Date(1979, 0, 5);
	
	Staff Barnaby = new Staff("Barnaby", "James", "Strauss", barnabyBDate, "17 Thisisawful Ave.", "9788888888", "bstrauss@udel.edu", "Thurs. 8-10", 5, 300.6, barnabyHDate, eTitle.Dean);
	Staff Heather =  new Staff("Heather", "Rose", "Perennial", heatherBDate, "5 Lousy Ln.", "9788888881", "hperennial@udel.edu", "Wed. & Mon. 6-9", 2, 409.3, heatherHDate, eTitle.Prof);
	Staff Frank = new Staff("Frank", "Matthew", "Hammond", frankBDate, "Theresabetterwaytodothis Dr.", "9788888882", "fhammond@udel.edu", "Always", 1, 696.9, frankHDate, eTitle.Senor);
	Staff Joe = new Staff("Joe", "John", "Schmoe", joeBDate, "1 Moreleft St.", "9788808883)", "jschmoe@udel.edu", "Last week 9-5", 5, 562.0, joeHDate, eTitle.Dean);
	Staff Harriett = new Staff("Harriett", "E", "Tubman", harriettBDate, "19 Mediocre St.", "9783761298", "htubman@udel.edu", "Mon., Wed. Fri. 3-4", 19, 431.4, harriettHDate, eTitle.Prof);
	
	ListofStaff.add(Barnaby);
	ListofStaff.add(Heather);
	ListofStaff.add(Frank);
	ListofStaff.add(Joe);
	ListofStaff.add(Harriett);
	}
}
