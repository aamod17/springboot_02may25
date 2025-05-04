package com.amodit.streamex.model;

public class Student {
	
	private Integer sid;
	private String sname;
	private Integer phone;
	private String coursename;
	private Double feepaid;
	private Double feeBalance;
	
	public Student() {
		super();
	}

	public Student(Integer sid, String sname, Integer phone, String coursename, Double feepaid, Double feeBalance) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.phone = phone;
		this.coursename = coursename;
		this.feepaid = feepaid;
		this.feeBalance = feeBalance;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Double getFeepaid() {
		return feepaid;
	}

	public void setFeepaid(Double feepaid) {
		this.feepaid = feepaid;
	}

	public Double getFeeBalance() {
		return feeBalance;
	}

	public void setFeeBalance(Double feeBalance) {
		this.feeBalance = feeBalance;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phone=" + phone + ", coursename=" + coursename
				+ ", feepaid=" + feepaid + ", feeBalance=" + feeBalance + "]";
	}
	
	

}
