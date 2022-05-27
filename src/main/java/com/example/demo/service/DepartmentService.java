package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.DepartmentNotFound;
import com.example.demo.model.Department;

public interface DepartmentService {

	public Department addDepartment(Department dept);

	public List<Department> fetchAllDepartment();

	public Department fetchDepartmentById(Integer departmentId) throws DepartmentNotFound;

}
