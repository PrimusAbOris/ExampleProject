package com.coderscampus.domain;

import java.time.LocalDate;

/**
 * I am using NOTEPAD for notes, Trevor.
 * 
 * When a monkey commits to main by accident,
 * does the tiger fire the monkey?
 * Does he transfer the monkey to another branch?
 */

class Profile {
	private Integer id;
	private String profileName;
	private LocalDate createdDate;
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String name) {
		this.profileName = name;
	}
}
