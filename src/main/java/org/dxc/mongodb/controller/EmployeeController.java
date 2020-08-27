package org.dxc.mongodb.controller;

import java.math.BigInteger;
import java.util.List;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService emp;

	@RequestMapping("/getall")
	public List<Employee> getAll() {
		return emp.getAllEmployee();
	}

	@PostMapping(value = "/saveemployee")
	public HttpStatus saveBook(@RequestBody Employee employee) {
		HttpStatus status = emp.saveEmployee(employee);
		return status;
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Employee employee) {
		String status = emp.updateBook(employee);
		return status;

	}

	@DeleteMapping(value = "/delete/{empid}")
	public String deleteById(@PathVariable Integer empid) {
		emp.delete(empid);
		return "Successfully Deleted ID: "+empid;
	}
}
