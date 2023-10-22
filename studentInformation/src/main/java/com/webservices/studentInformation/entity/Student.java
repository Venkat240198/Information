package com.webservices.studentInformation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student_Table")
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	@Column(unique = true, nullable = false)
	private String email;
	
	//Unidirectional
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id", referencedColumnName = "id")
	private Address address;

	//Many to One
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="college_id", referencedColumnName = "id")
	private College college;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id", referencedColumnName = "id")
	private List<Subject> subject;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;
	
//	//Bidirectional
//	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
//	private List<Task> task;
}
