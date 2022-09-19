package com.lab1employee.week2oops;

public class Employee {
	private String Firstname;
	private String Lastname;
	
public Employee(String Firstname, String Lastname) {
	this.Firstname=Firstname;
    this.Lastname=Lastname;
}

public String getFirstname() {
	return Firstname;
}

public void setFirstname(String firstname) {
	Firstname = firstname;
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}

	
}