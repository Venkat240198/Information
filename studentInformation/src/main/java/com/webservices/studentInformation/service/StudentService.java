package com.webservices.studentInformation.service;

import java.util.List;

import com.webservices.studentInformation.entity.Student;

public interface StudentService {
	
	Student createStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
	void deleteAll();
	void deleteById(int id);

}
