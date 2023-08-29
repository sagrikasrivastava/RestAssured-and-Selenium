package com.sagrika.restAssuredApiAutomation;

import java.util.List;

public class EmployeePojo {
	private String name;
	private String job;
	private List<String> skills;
	private Details details;

	public EmployeePojo(String name, String job, List<String> skills, String companyName, String emailId) {
		super();
		this.name = name;
		this.job = job;
		this.skills = skills;
		this.details = new Details(companyName, emailId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}
}
