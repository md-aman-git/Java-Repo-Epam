package com.epam.stumgmt.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.epam.stumgmt.entity.Student;
import com.epam.stumgmt.entity.StudentInfo;
import com.epam.stumgmt.repo.StudentRepoHiber;
import com.epam.stumgmt.service.StudentService;
import com.epam.stumgmt.vo.StudentInfoVO;
import com.epam.stumgmt.vo.StudentVO;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	StudentService studentService;
	@GetMapping("/student")
	public String getStudent(Model m) {
		System.out.println("Hello student...");
		m.addAttribute("msg", "This is the message passed from controller.");
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		org.springframework.core.io.Resource resource = resourceLoader.getResource("file:webapp/WEB-INF/img/India.png");
		String path = null;
		try {
			path = resource.getFile().getPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			File file = resource.getFile();
			System.out.println("Size : " + file.length());
			//file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("pat", path);
		return "test2";
	}
	
	@GetMapping("/student1") //request parameter for query string (?id=)
	public String getStudent1(Model m, @RequestParam Long id, @RequestParam String name) {
		System.out.println("Using RequestParam...");
		m.addAttribute("msg", "Student ID : " + id);
		m.addAttribute("name", "Student Name : " + name);
		return "test";
	}
	
	@GetMapping("/student2/{id}/{name}") //place holder for url path
	public String getStudent2(Model m, @PathVariable Long id, @PathVariable String name) {
		System.out.println("Using PathVariable...");
		m.addAttribute("msg", "Student ID : " + id);
		m.addAttribute("name", "Student Name : " + name);
		return "test";
	}
	
	@GetMapping("/login")
	public String login(Model m) {
		return "login";
	}
	
//	@PostMapping("/login")
//	public String loginSubmit(Model m,  @RequestParam String name,
//			@RequestParam String password) {
//		System.out.println("name : " + name);
//		System.out.println("password : " + password);
//		m.addAttribute("name", name);
//		m.addAttribute("pass", password);
//		return "loginDetails";
//	}
	
	@PostMapping("/login")
	public String loginSubmit(Model m, StudentVO student) {
		System.out.println("name : " + student.getUserName());
		System.out.println("password : " + student.getPassword());
		
		String username = student.getUserName();
		String password = student.getPassword();
		boolean success = studentService.checkLogin(username, password);
		System.out.println("user : " + username);
		System.out.println("user : " + password);
		System.out.println("success : " + success);
		if(success) {
			m.addAttribute("name", username);
			m.addAttribute("pass", password);
			return "loginDetails";
		}
		return "errorPage";
	}
	
	@GetMapping("/signup")
	public String signup(Model m) {
		return "signup";
	}
	@PostMapping("/signup")
	public String signupSubmit(Model m, StudentVO student) {
		String username = student.getUserName();
//		String password = student.getPassword();
//		boolean success = studentService.checkLogin(username, password);
		studentService.registerUser(student.getUserName(), student.getUserName(), "myPass");
		System.out.println("user : " + username);
//		System.out.println("pass : " + password);
		//System.out.println("success : " + success);
		m.addAttribute("name", username);
//		m.addAttribute("pass", password);
		return "testSignup";
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model m) {
		List<StudentVO> studentsVO = studentService.findAll();
//		for(StudentVO studVO : studentsVO) {
//			System.out.println(studVO);
//		}
		m.addAttribute("studList", studentsVO);
		return "studentList";
	}
	@GetMapping("/delete/{id}")
	public String deleteStudent(Model m, @PathVariable int id) {
		studentService.deleteStudent(id);
		return "redirect:/stu/students";
	}
	@GetMapping("/update/{id}")
	public String updateStudent(Model m, @PathVariable int id) {
		StudentVO studVO = studentService.findById(id);
		System.out.println(studVO);
		m.addAttribute("studUpdate", studVO);
		return "updateStudent";
	}
	@PostMapping("/update/{id}")
	public String updateStudentSubmit(Model m, @PathVariable int id, @RequestParam String userName) {
		System.out.println("Hello update");
		studentService.updateStudent(id, userName);
		return "redirect:/stu/students";
	}
	
	@GetMapping("/studentInfo")
	public String getAllStudentsDocs(Model m) {
		List<StudentInfoVO> studentsVO = studentService.findAllInfo();
//		for(StudentVO studVO : studentsVO) {
//			System.out.println(studVO);
//		}
		m.addAttribute("studInfoList", studentsVO);
		System.out.println(studentsVO.get(0).getFile_path());
		return "studInfo";
	}
	@GetMapping("/imageView/{path}")
	public String showImage(Model m, @PathVariable String path) {
		System.out.println("Hello Image...");
		m.addAttribute("img", path);
		System.out.println(path);
		return "imageView";
	}
}
