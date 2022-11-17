package com.epam.stumgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epam.stumgmt.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	public Student findByUserNameAndPassword(String userName, String password);
	@Query("SELECT max(s.id) FROM Student s")
	public Long getMaxId();
	public List<Student> findAll();
	public Student findById(int id);
}
