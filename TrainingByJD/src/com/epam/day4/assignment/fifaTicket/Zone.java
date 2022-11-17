package com.epam.day4.assignment.fifaTicket;

import java.util.HashMap;

public class Zone {
	HashMap<String, Block> blocks;

	public Zone(HashMap<String, Block> blocks) {
		super();
		this.blocks = blocks;
	}

	public HashMap<String, Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(HashMap<String, Block> blocks) {
		this.blocks = blocks;
	}
	
	
}
