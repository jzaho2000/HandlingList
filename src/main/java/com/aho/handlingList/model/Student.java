package com.aho.handlingList.model;

import org.springframework.lang.NonNull;
//import javax.

public class Student {
	
	// ei tarvetta käsitellä tässä harjoituksessa.
	//@NonNull
	//private int id;
	
	@NonNull
	private String name;
	
	public Student() {
		this.name = "";
	}
	
	public Student(String name) {
		this.name = name;
			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
