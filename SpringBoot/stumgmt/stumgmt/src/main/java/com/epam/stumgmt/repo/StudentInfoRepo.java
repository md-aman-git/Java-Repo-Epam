package com.epam.stumgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.stumgmt.entity.Student;
import com.epam.stumgmt.entity.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo, Integer> {
	public StudentInfo findById(int id);
	public List<StudentInfo> findAll();
}
