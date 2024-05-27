package com.tutorialsacademy.dto;

public class UserDetailsDto {

	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String email;
	private String password;
	private int age;
	private long phone;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public long getPhone() {
		return phone;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	
}
