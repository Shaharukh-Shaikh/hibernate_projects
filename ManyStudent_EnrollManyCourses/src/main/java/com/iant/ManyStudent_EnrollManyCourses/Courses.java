package com.iant.ManyStudent_EnrollManyCourses;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Courses {
	@Id
	private int courses_id;
	private String courses_name;
	@ManyToMany
	private List<Student>std;
	public int getCourses_id() {
		return courses_id;
	}
	public void setCourses_id(int courses_id) {
		this.courses_id = courses_id;
	}
	public String getCourses_name() {
		return courses_name;
	}
	public void setCourses_name(String courses_name) {
		this.courses_name = courses_name;
	}
	public List<Student> getStd() {
		return std;
	}
	public void setStd(List<Student> std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Courses [courses_id=" + courses_id + ", courses_name=" + courses_name + ", std=" + std + "]";
	}
	


}
