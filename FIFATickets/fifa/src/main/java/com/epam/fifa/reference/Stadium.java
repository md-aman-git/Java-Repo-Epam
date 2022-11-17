package com.epam.fifa.reference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.epam.fifa.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {
	private int id;
	private Map<Integer, Block> blocks;
	void initializeBlock() {
		//long time = System.currentTimeMillis();
		int seats = 5;
		for(int j = 1; j <= 4; j++) {
			Collection<User> userQ = new LinkedList<>();
			Queue<User> q = (Queue<User>) userQ;
//			User user = q.peek();
			Block block = new Block(q, seats);
			int id = repo.save(block);
			
			blocks.put(id, block);
		}
	}
//	void initStadium() {
//		blocks = new HashMap<String, Block>();
//		for(int j = 1; j <= 4; j++) {
//			Collection<User> userQ = new LinkedList<>();
//			Queue<User> q = (Queue<User>) userQ;
////			User user = q.peek();
//			Block block = new Block(j, userQ, seats);
//			blocks.put("B" + j, block);
//		}
//	}
}
