package com.iant.Emp_Syatem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Emp_Records {
	@Id
	private int Emp_Id;
	
	private String Emp_Name;
	
	private String Location;
	@OneToOne
	@JoinColumn(name = "Dept_id")
	private Department_Records dept;

	public int getEmp_Id() {
		return Emp_Id;
	}

	@Override
	public String toString() {
		return "Emp_Records [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Location=" + Location + ", dept=" + dept
				+ "]";
	}

	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Department_Records getDept() {
		return dept;
	}

	public void setDept(Department_Records dept) {
		this.dept = dept;
	}

}
