package com.epam.stumgmt.vo;

import org.springframework.web.multipart.MultipartFile;

import com.epam.stumgmt.entity.StudentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfoVO {
	private int id;
	private String doc_category;
	private MultipartFile file;
	private String file_path;
}
