package com.example.mapstruct;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Sample")
@Table(name="Sample")
public class Sample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sampleID")
	private Integer sampleID;
	
	@Column(name = "sampleName")
	private String sampleName;
	
	@Column(name = "experimentDate")
	private Date sampleDate;
	
	@Column(name = "reverse")
	private Boolean reverse;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "type")
	private String type;

	public Integer getSampleID() {
		return sampleID;
	}

	public void setSampleID(Integer sampleID) {
		this.sampleID = sampleID;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
