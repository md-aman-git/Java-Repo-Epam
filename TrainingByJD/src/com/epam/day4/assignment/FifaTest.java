package com.epam.day4.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

@SuppressWarnings({ "rawtypes", "unused" })
public class FifaTest {

	static HashMap<String, LinkedList> qMap = null;

	public static void main(String[] args) {

		LinkedList<TicketBuyer> Q1 = new LinkedList<>();
		LinkedList<TicketBuyer> Q2 = new LinkedList<>();
		LinkedList<TicketBuyer> Q3 = new LinkedList<>();

		qMap.put("Q1", Q1);
		qMap.put("Q2", Q2);
		qMap.put("Q3", Q3);

		HashMap<String, Integer> ticketPosition = new HashMap<>();
		initalizeTicketForQs(ticketPosition);

	}

	static void initalizeTicketForQs(HashMap<String, Integer> ticketPositionMap) {
		ticketPositionMap.put("Q1", 5);
		ticketPositionMap.put("Q2", 5);
		ticketPositionMap.put("Q3", 5);
	}

	static void sellTicket(HashMap<String, Integer> tMap, String qKey) {

//LinkedList<TicketBuyer> Q = (LinkedList<TicketBuyer>) qMap.get(qKey);
		Integer remainTicket = tMap.get(qKey);
		if (remainTicket > 0) {
			remainTicket = remainTicket - 1;
//update the quee
			tMap.replace(qKey, remainTicket);

		}

		if (remainTicket == 0)// destroy the Queue
		{

			qMap.remove(qKey);

		}

	}

	void assignPersonToQueue(HashMap qMap, TicketBuyer buyer) {

		LinkedList<TicketBuyer> Q1 = (LinkedList<TicketBuyer>) qMap.get("Q1");
		Q1.add(buyer);
		qMap.replace("Q1", Q1);

	}

}