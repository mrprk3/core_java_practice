package com.mrprk.java8;

import java.util.List;
import java.util.Map;
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

		// Lets do group the employee which salary is same
		Map<Long, List<Employee>> groupBySalary = loadAllEmp.stream()
				.collect(Collectors.groupingBy(Employee::getEmpSalary));
		groupBySalary.forEach((salary, employees) -> {
			System.out.println(salary);
			System.out.println(employees);
		});

		// Lets find all the department name
		List<String> deptList = loadAllEmp.stream().map((e) -> e.getDepartment().getDeptName())
				.collect(Collectors.toList());
		System.out.println(deptList);

		// Lets find the Department from Employee
		List<Department> department = loadAllEmp.stream().map((emp) -> emp.getDepartment())
				.collect(Collectors.toList());

		// Lets do group the department which department is same
		Map<String, List<Department>> groupByDepartment = department.stream()
				.collect(Collectors.groupingBy(Department::getDeptName));
		groupByDepartment.forEach((deptName, dept) -> {
			System.out.println(deptName);
			System.out.println(dept);
		});

	}

}
