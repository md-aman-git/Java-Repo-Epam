package com.javabydeveloper.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_mst_employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Integer Id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMP_ID")
	private String empId;

	@Column(name = "SALARY")
	private Double salary;

	public Employee() {}
	public Employee(String name, String empId, Double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	

}
