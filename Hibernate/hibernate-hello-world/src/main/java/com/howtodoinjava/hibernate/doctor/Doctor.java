package com.howtodoinjava.hibernate.doctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String reg_no;
	
	@Column
	Specialisation specialization;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public Specialisation getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialisation specialization) {
		this.specialization = specialization;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Doctor() {}
	public Doctor(String name, String reg_no, Specialisation specialization) {
		super();
		this.name = name;
		this.reg_no = reg_no;
		this.specialization = specialization;
	}
	
	public enum Specialisation {
		ENT,
		CARDIO,
		HEART
	}
	
}

