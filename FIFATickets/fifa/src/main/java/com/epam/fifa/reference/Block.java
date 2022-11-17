package com.epam.fifa.reference;

import java.util.Collection;
import java.util.Queue;

import com.epam.fifa.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Block {
	private int id;
	private Collection<User> queue;
	int seats;
}
