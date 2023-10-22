package com.example.RegisterLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RegisterLogin.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	
	

}
