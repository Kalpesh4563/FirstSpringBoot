package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.DepartmentNotFound;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(Department dept) {
		return departmentRepository.save(dept);
	}

	@Override
	public List<Department> fetchAllDepartment() {
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Integer departmentId) throws DepartmentNotFound {
		
		Optional<Department> department = departmentRepository.findById(departmentId);
		
		if(!department.isPresent()) {
			throw new DepartmentNotFound("Department Not Found");
		}
		
		return department.get();
	}
}
