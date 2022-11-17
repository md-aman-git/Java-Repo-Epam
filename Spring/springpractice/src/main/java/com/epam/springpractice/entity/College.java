package com.epam.springpractice.entity;

import java.util.jar.Attributes.Name;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class College {
	private int id;
	private String collegeName;
}
