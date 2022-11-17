package com.epam.partsmgmt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartVO {
	private int id;
	private String name;
	private String category;
}
