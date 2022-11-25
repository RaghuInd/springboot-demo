package com.employee.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.dto.Employee;

@RestController
public class DemoController {
	// Read
	//@RequestMapping(value = "employee", method = RequestMethod.GET)
	@GetMapping("employee")
	public String getEmployee() {
		System.out.println("Http get ");
		return "Get Employee.";
	}

	// Create
	//@RequestMapping(value = "employee", method = RequestMethod.POST)
	@PostMapping("employee")
	public String addNewEmployee(@RequestBody Employee employee) {
		System.out.println("Http post");
		return "POST employee";
	}

	// Update
	//@RequestMapping(value = "employee", method = RequestMethod.PUT)
	@PutMapping("employee")
	public String updateEmployee(@RequestBody Employee employee) {
		System.out.println("Http PUT");
		return "Update employee";
	}

	// Partial update
	//@RequestMapping(value = "employee", method = RequestMethod.PATCH)
	@PatchMapping("employee")
	public String updateEmployeeSalary(@RequestBody Employee employee) {
		System.out.println("Http PATCH");
		return "Patch employee";
	}

	// Delete
	//@RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("employee/{id}")
	public String deleteEmployeeByID(@PathVariable("id") Integer employeeId) {
		System.out.println("Http Delete");
		return "Delete emp id:"+employeeId;
	}

}
