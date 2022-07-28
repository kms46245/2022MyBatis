package ch06.domain;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String lastName;
	private LocalDate hireDate;
	
	@Override
	public String toString() {
		return String.format("%3d %-11s %8s", employeeId, lastName, hireDate);
	}
}
