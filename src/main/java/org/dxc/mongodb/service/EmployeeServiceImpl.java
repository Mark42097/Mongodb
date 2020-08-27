package org.dxc.mongodb.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();

	}

	@Override
	public HttpStatus saveEmployee(Employee employee) {
		boolean status = repository.save(employee) != null;
		return status ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@Override
	public String updateBook(Employee employee) {
		boolean status = repository.save(employee) != null;
		return status ? "Updated Book Having ID: " + employee.getEmployeeid() + " Successfully" : "Failed";
	}

	@Override
	public void delete(Integer empid) {
		repository.deleteById(empid);

	}

}
