package com.sagrika.restAssuredApiAutomation;

public class Details {
	private String companyName;
	private String emailId;
	
	
	public Details(String companyName, String emailId) {
		this.companyName = companyName;
		this.emailId = emailId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	//hi this is change in develop branch
}
