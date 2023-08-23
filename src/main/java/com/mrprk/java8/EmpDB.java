package com.mrprk.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpDB {

	public static List<Employee> loadAllEmp() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1001, "Anuska", 132000l, new Department(1051, "IT")));
		emp.add(new Employee(1041, "Deepika", 126400l, new Department(1044, "IT")));
		emp.add(new Employee(1601, "Ankush", 44000l, new Department(1032, "ECE")));
		emp.add(new Employee(1071, "Virat", 126400l, new Department(1021, "ME")));
		emp.add(new Employee(1071, "Dhoni", 44000l, new Department(1021, "ECE")));
		emp.add(new Employee(1071, "Amir", 126400l, new Department(1021, "ME")));
		emp.add(new Employee(1071, "Salman", 132000l, new Department(1021, "IT")));

		return emp;
	}

}
