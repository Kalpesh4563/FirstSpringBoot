package com.example.demo.exception;

public class DepartmentNotFound extends Exception{

	private static final long serialVersionUID = 1L;

	public DepartmentNotFound(String message) {
		super(message);
	}
}
