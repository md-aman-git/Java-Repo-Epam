package com.epam.stumgmt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenderVO {
	private String name;
	private String gender;
	private float probability;
	private int count;
}
