package com.iant.ManyStudent_EnrollManyCourses;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int std_id;
	private String std_name;
	@ManyToMany
	List<Courses> cou;
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public List<Courses> getCou() {
		return cou;
	}
	public void setCou(List<Courses> cou) {
		this.cou = cou;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", cou=" + cou + "]";
	}


}
