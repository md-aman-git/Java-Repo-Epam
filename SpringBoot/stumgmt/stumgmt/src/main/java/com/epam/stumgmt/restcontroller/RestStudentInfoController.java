package com.epam.stumgmt.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.stumgmt.service.StudentService;
import com.epam.stumgmt.vo.StudentInfoVO;

@RestController
public class RestStudentInfoController {
	@Autowired
	StudentService studentService;

	@PostMapping("/studentInfo")
	public ResponseEntity<String> setStudInfo(@ModelAttribute StudentInfoVO studentInfoVO) {
		studentService.setStudentInfo(studentInfoVO);
		System.out.println(studentInfoVO.toString());
		return new ResponseEntity<>("Student Info Saved !!!", HttpStatus.CREATED);
	}
}
