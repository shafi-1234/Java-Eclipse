package com.oops;

public class CollegeInformation {
	
	private int collegeId;
	private String clgName;
	private String studentName;
	
	// Setter
	public void setClgId(int collegeId) {
		if(collegeId>1) {
		this.collegeId=collegeId;
		}
		else {
			this.collegeId=0;
		}
	}
	public void setClgName(String clgName) {
		this.clgName=clgName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	
	
	// Getters
	public int getClgId() {
		return collegeId;
	}
	public String getClgName() {
		return clgName;
	}
	public String getstudentName() {
		return studentName;
	}

}
