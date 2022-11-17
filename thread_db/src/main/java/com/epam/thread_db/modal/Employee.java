package com.epam.thread_db.modal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="threademp")
@AllArgsConstructor
public class Employee {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "salary")
	private double salary;
}
