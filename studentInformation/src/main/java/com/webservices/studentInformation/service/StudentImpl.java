package com.webservices.studentInformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.studentInformation.entity.Student;
import com.webservices.studentInformation.entity.Task;
import com.webservices.studentInformation.repo.StudentRepo;

@Service
public class StudentImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> studentById = studentRepo.findById(id);
		if(studentById.isPresent()) {
			return studentById.get();
		}throw new RuntimeException("Employee Not Found....");
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
		studentRepo.deleteAll();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

}
