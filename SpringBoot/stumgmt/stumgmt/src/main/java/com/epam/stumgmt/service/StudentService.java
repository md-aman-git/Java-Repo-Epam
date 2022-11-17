package com.epam.stumgmt.service;

import java.util.List;

import com.epam.stumgmt.entity.StudentInfo;
import com.epam.stumgmt.vo.StudentInfoVO;
import com.epam.stumgmt.vo.StudentVO;

public interface StudentService {
	public boolean checkLogin(String username, String password);
	public void registerUser(String fullName, String username, String password);
	public List<StudentVO> findAll();
	public void deleteStudent(int id);
	public void updateStudent(int id, String userName);
	public StudentVO findById(int id);
	public void setStudentInfo(StudentInfoVO studentInfoVO);
	public List<StudentInfoVO> findAllInfo();
}
