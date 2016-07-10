package com.roshnee.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.roshnee.spring.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addStudent(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(student);
		logger.info("Student saved successfully, Student Details="+student);
	}

	public void updateStudent(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(student);
		logger.info("Student updated successfully, Student Details="+student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> listStudents() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Student> studentsList = session.createQuery("from Student").list();
		for(Student student : studentsList){
			logger.info("Student List::"+student);
		}
		return studentsList;
	}

	public Student getStudentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Student student = (Student) session.load(Student.class, new Integer(id));
		logger.info("Student loaded successfully, Student details="+student);
		return student;
	}

	public void removeStudent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Student student = (Student) session.load(Student.class, new Integer(id));
		if(null != student){
			session.delete(student);
		}
		logger.info("Student deleted successfully, student details="+student);
	}

}
