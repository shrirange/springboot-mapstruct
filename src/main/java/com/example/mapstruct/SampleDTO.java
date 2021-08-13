package com.example.mapstruct;

import java.sql.Date;

public class SampleDTO {
	
	private Integer sampleID;
	
	private String sampleDtoName;
	
	private Date sampleDate;
	
	private Boolean reverse;
	
	private String comments;
	
	private String sampleDtoType;

	public Integer getSampleID() {
		return sampleID;
	}

	public void setSampleID(Integer sampleID) {
		this.sampleID = sampleID;
	}

	public String getSampleDtoName() {
		return sampleDtoName;
	}

	public void setSampleDtoName(String sampleName) {
		this.sampleDtoName = sampleName;
	}

	public Date getSampleDate() {
		return sampleDate;
	}

	public void setSampleDate(Date sampleDate) {
		this.sampleDate = sampleDate;
	}

	public Boolean getReverse() {
		return reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSampleDtoType() {
		return sampleDtoType;
	}

	public void setSampleDtoType(String type) {
		this.sampleDtoType = type;
	}
	

}
