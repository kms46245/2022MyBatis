package ch06.dao;

import java.util.List;

import ch06.domain.Employee;

public interface EmployeeDao {
	List<Employee> selectEmployees();
}
