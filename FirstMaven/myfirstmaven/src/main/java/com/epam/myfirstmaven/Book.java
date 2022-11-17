package com.epam.myfirstmaven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private int id;
	private int price;
	private String name;
	private String author;
}
