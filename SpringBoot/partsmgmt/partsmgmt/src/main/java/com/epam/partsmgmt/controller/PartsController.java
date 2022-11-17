package com.epam.partsmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epam.partsmgmt.service.PartService;
import com.epam.partsmgmt.vo.PartVO;

@RestController
@CrossOrigin("*")
public class PartsController {
	
	@Autowired
	PartService partService;
	@GetMapping("/parts")
	public ResponseEntity<List<PartVO>> getAllParts() {
		System.out.println("Hello parts");
		List<PartVO> partsVO = partService.findAll();
		return new ResponseEntity<>(partsVO, HttpStatus.OK);
	}
	@GetMapping("/parts/{id}")
	public ResponseEntity<PartVO> getPart(@PathVariable int id) {
		PartVO partVO = partService.findPartById(id);
		System.out.println("ID : " + id);
		
		return new ResponseEntity<>(partVO, HttpStatus.OK);
	}
	@PostMapping("/parts")
	public ResponseEntity<String> savePart(@RequestBody PartVO partVO) {
		partService.savePart(partVO);
		return new ResponseEntity<>("Saved", HttpStatus.CREATED);
	}
	@DeleteMapping("/parts/{id}")
	public ResponseEntity<String> deletePart(@PathVariable int id) {
		partService.deletePartById(id);
		System.out.println("Delete ID : " + id);
		
		return new ResponseEntity<>("Deleted : " + id, HttpStatus.OK);
	}
	@PutMapping("/parts")
	public ResponseEntity<String> updatePart(@RequestBody PartVO partVO) {
		partService.updatePart(partVO);
		return new ResponseEntity<>("Updated : " + partVO.getId(), HttpStatus.OK);
	}
	@GetMapping("/test")
	public String testMethod() {
		return "Hello World";
	}
	
}
