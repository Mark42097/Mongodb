package org.dxc.mongodb.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.dxc.mongodb.model.Employee;
import org.springframework.http.HttpStatus;

public interface EmployeeService {

public List<Employee> getAllEmployee();

public HttpStatus saveEmployee(Employee employee);

public String updateBook(Employee employee);

public void delete(Integer empid);
}


