package com.epam.fifa.reference;

import java.util.HashMap;
import java.util.Queue;

import com.epam.fifa.entity.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Stadium> stadiums = new HashMap<String, Stadium>();
		for(int i = 1; i <= 4; i++) {
			HashMap<String, Zone> zones = new HashMap<String, Zone>();
			Stadium stadium = new Stadium(i, zones);
			stadium.initializeZones();
			stadiums.put("S" + i, stadium);
		}
		FifaWorld fifa = new FifaWorld(stadiums);
		for(int i = 1; i <= 4; i++) {
			Stadium stadium = fifa.getStadiums().get("S" + i);
			System.out.println("Stadium ID : " + stadium.getId());
			for(int j = 1; j <= 4; j++) {
				Zone zone = stadium.getZones().get("Z" + j);
				System.out.println("Zone ID : " + zone.getId());
				for(int k = 1; k <= 4; k++) {
					Block block = zone.getBlocks().get("B" + k);
					System.out.println("Block ID : " + block.getId());
					for(int l = 1; l <= 4; l++) {
						Queue<User> queue = block.getQueue();
						System.out.println("Queue Size : " + queue.size());
					}
				}
			}
		}
	}
}
