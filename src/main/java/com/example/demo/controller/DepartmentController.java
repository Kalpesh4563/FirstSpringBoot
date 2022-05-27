package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DepartmentNotFound;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments/add")
	public Department addDepartment(@RequestBody Department dept) {
		return departmentService.addDepartment(dept);
	}

	@GetMapping("/departments")
	public List<Department> fetchAllDepartment() {
		return departmentService.fetchAllDepartment();
	}

	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Integer departmentId) throws DepartmentNotFound {
		return departmentService.fetchDepartmentById(departmentId);
	}
}
