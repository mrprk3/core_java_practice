package com.mrprk.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> loadAllEmp = EmpDB.loadAllEmp();
		for (Employee emp : loadAllEmp) {
			System.out.println(emp);
		}
		// Lets find out the employee those who have more than 55000 salary
		List<Employee> collect = loadAllEmp.stream().filter((emp) -> emp.getEmpSalary() > 5500)
				.collect(Collectors.toList());
		System.out.println(collect);
		
		// Lets find out all the employee name
		List<String> names = loadAllEmp.stream().map((emp) -> emp.getEmpName()).collect(Collectors.toList());
		System.out.println(names);
		
		// Lets find out only salary and name of all employee name who's name start with A
		List<Emp> values = loadAllEmp.stream().filter((emp) -> emp.getEmpName().startsWith("A"))
				.map(t -> new Emp(t.getEmpName(), t.getEmpSalary())).collect(Collectors.toList());
		System.out.println(values);

	}

}
