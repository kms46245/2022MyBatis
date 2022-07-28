package ch06.presentation;

import ch06.service.EmployeeService;

public class EmployeeIo {
	private EmployeeService employeeService;
	
	public EmployeeIo(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public void play() {
		employeeService.getEmployees().forEach(System.out::println);
	}
}
