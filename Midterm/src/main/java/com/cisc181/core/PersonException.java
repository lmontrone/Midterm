package com.cisc181.core;

public class PersonException extends Exception {
	
	public String Person;
	
	public PersonException(int age){
		System.out.println("Person is too old");
	}
	public PersonException(String phone_number){
		System.out.println("Phone number is invalid");
	}

}
