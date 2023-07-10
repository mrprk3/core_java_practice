package com.mrprk;

public class Student {
	
	private int id;
	
	private String name;
	
	private String dept;
	
	private String age;

	public Student(int id, String name, String dept, String age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	
	
	

}
