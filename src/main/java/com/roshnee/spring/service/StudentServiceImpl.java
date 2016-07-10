package com.roshnee.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roshnee.spring.dao.StudentDAO;
import com.roshnee.spring.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Transactional
	public void addStudent(Student student) {
		this.studentDAO.addStudent(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		this.studentDAO.updateStudent(student);
	}

	@Transactional
	public List<Student> listStudents() {
		return this.studentDAO.listStudents();
	}

	@Transactional
	public Student getStudentById(int id) {
		return this.studentDAO.getStudentById(id);
	}

	@Transactional
	public void removeStudent(int id) {
		this.studentDAO.removeStudent(id);
	}

}
