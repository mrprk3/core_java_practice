package com.mrprk.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpDB {

	public static List<Employee> loadAllEmp() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1580, "Anuska", 5000));
		emp.add(new Employee(1550, "Virat", 5600));
		emp.add(new Employee(1578, "Dhoni", 5700));
		emp.add(new Employee(1597, "Rohit", 5080));
		emp.add(new Employee(1589, "Rinku", 5900));
		return emp;
	}

}
