package com.mrprk.java8;

public class Emp {

	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	private Long empSalary;

	public Emp(String empName, Long empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}
