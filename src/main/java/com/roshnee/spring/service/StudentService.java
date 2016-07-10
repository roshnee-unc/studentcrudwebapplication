package com.roshnee.spring.service;

import java.util.List;

import com.roshnee.spring.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	public void updateStudent(Student student);
	public List<Student> listStudents();
	public Student getStudentById(int id);
	public void removeStudent(int id);
	
}
