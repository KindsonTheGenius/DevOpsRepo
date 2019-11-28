package com.kindsonthegenius.thymeleafapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id
	private Integer Id;
	private String name;
	private String department;
	private String updatedBy;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String updatedOn;
	
	public Student() {
		
	}

	public Student(Integer id, String name, String department, String updatedBy, String updatedOn) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", department=" + department + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
}
