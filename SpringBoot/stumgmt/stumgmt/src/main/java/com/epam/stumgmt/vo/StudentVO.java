package com.epam.stumgmt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {
	private int id;
	private String studId;
	private String fullName;
	private String userName;
	private String password;
}
