package com.iant.Emp_Syatem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department_Records {
	@Id
	private int Dept_Id;
	
	private String Dept_Name;

	public int getDept_Id() {
		return Dept_Id;
	}

	public void setDept_Id(int dept_Id) {
		Dept_Id = dept_Id;
	}

	public String getDept_Name() {
		return Dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}

	@Override
	public String toString() {
		return "Department_Records [Dept_Id=" + Dept_Id + ", Dept_Name=" + Dept_Name + "]";
	}
	
	
	
}
