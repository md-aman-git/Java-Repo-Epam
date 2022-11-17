package com.epam.stumgmt.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.epam.stumgmt.entity.Student;
import com.epam.stumgmt.entity.StudentInfo;
import com.epam.stumgmt.repo.StudentInfoRepo;
import com.epam.stumgmt.repo.StudentRepo;
import com.epam.stumgmt.service.StudentService;
import com.epam.stumgmt.vo.StudentInfoVO;
import com.epam.stumgmt.vo.StudentVO;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	StudentInfoRepo studentInfoRepo;
	@Override
	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		if(studentRepo.findByUserNameAndPassword(username, password) != null) return true;
		return false;
	}
	@Override
	public void registerUser(String fullName, String username, String password) {
		// TODO Auto-generated method stub
		Long myId = studentRepo.getMaxId();
		if(myId == null) myId = 0L;
		String studId = "STUD-" + (++myId);
		Student student = new Student();
		student.setFullName(fullName);
		student.setPassword("pass@000");
		student.setStudId(studId);
		student.setUserName(username);
		studentRepo.save(student);
	}
	@Override
	public List<StudentVO> findAll() {
		// TODO Auto-generated method stub
		List<Student> students = studentRepo.findAll();
		List<StudentVO> studentsVO = new ArrayList<>();
		for(Student stud : students) {
			StudentVO studVO = new StudentVO();
			studVO.setId(stud.getId());
			studVO.setFullName(stud.getFullName());
			studVO.setPassword(stud.getPassword());
			studVO.setStudId(stud.getStudId());
			studVO.setUserName(stud.getUserName());
			studentsVO.add(studVO);
		}
		return studentsVO;
	}
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
//		Student student = studentRepo.findById(id);
//		if(student != null) {
//			studentRepo.delete(student);
//		}
		studentRepo.deleteById(id);
	}
	@Override
	public void updateStudent(int id, String userName) {
		// TODO Auto-generated method stub
		Student student = studentRepo.findById(id);
		student.setUserName(userName);
		studentRepo.save(student);
	}
	@Override
	public StudentVO findById(int id) {
		// TODO Auto-generated method stub
		Student student = studentRepo.findById(id);
		StudentVO studVO = new StudentVO();
		if(student != null) {
			studVO.setId(student.getId());
			studVO.setFullName(student.getFullName());
			studVO.setStudId(student.getStudId());
			studVO.setUserName(student.getUserName());
			studVO.setPassword(student.getPassword());
		}
		return studVO;
	}
	@Override
	public void setStudentInfo(StudentInfoVO studentInfoVO) {
		// TODO Auto-generated method stub
		StudentInfo studentInfo = new StudentInfo();
		if(studentInfoRepo.findById(studentInfoVO.getId()) != null) {
			studentInfo.setId(studentInfoVO.getId());
		}
		MultipartFile multipartFile = studentInfoVO.getFile();
		studentInfo.setDoc_category(studentInfoVO.getDoc_category());
		String filePath = "C:\\Users\\Md_Aman\\Documents\\Student Info\\"; 
		String newPath = "";
		try {
			newPath = write(multipartFile, filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studentInfo.setFile_path(newPath);
		studentInfoRepo.save(studentInfo);
	}
	public String write(MultipartFile file, String dir) throws IOException {
	    Path filepath = Paths.get(dir, file.getOriginalFilename());
	    
	    try (OutputStream os = Files.newOutputStream(filepath)) {
	        os.write(file.getBytes());
	    }
	    return dir + file.getOriginalFilename();
	}
	@Override
	public List<StudentInfoVO> findAllInfo() {
		// TODO Auto-generated method stub
		List<StudentInfo> students = studentInfoRepo.findAll();
		List<StudentInfoVO> studentsVO = new ArrayList<>();
		for(StudentInfo stud : students) {
			StudentInfoVO studVO = new StudentInfoVO();
			studVO.setId(stud.getId());
			studVO.setDoc_category(stud.getDoc_category());
			studVO.setFile_path(stud.getFile_path());
			studentsVO.add(studVO);
		}
		return studentsVO;
	}
}
