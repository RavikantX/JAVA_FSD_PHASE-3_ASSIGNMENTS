package com.simplilearn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Here i have used @JsonIgnoreProperties ignore to ignore all the other values which we don't want...
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {


	private int id;
	private String name;
	private String username;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + "]";
	
}
}