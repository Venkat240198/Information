package com.webservices.studentInformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.studentInformation.entity.Student;
import com.webservices.studentInformation.entity.Task;
import com.webservices.studentInformation.service.StudentImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentImpl studentImpl;
	
	@PostMapping("/student")
//	url : http://localhost:9092/student
	public Student createStudent(@RequestBody Student student) {
		return studentImpl.createStudent(student);
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentImpl.getStudentById(id);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentImpl.getAllStudents();
	}
	
	@DeleteMapping("/students/deleteAll")
	public void deleteAllStudents() {
		studentImpl.deleteAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		studentImpl.deleteById(id);
	}

}
