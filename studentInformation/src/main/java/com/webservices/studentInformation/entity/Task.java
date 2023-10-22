package com.webservices.studentInformation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {
	@Id
	private int id;
	private String taskName;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	Student student;

}
