package com.practice.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Person {
	@Size(min = 2, max = 30, message = "Enter valid first name")
	private String firstName;

	@Size(min = 2, max = 30, message = "Enter valid last name")
	private String lastName;

	@NotEmpty(message = "Please enter email")
	@Email
	private String email;
	
	@NotNull(message = "Enter valid password")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
