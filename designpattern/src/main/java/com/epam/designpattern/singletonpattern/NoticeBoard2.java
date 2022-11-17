package com.epam.designpattern.singletonpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class NoticeBoard2 {
	private static NoticeBoard2 board;
	private ArrayList<String> notices;

	private NoticeBoard2() {
		notices = new ArrayList<String>();
	}
	/*
	 * public static NoticeBoard2 getInstance() { if(board == null) { board = new
	 * NoticeBoard2(); } return board; } this can create even two instances if two
	 * or more threads will try to get instance at a time(syncronization issue)
	 */

	synchronized public static NoticeBoard2 getInstance() {
		if (board == null) {
			board = new NoticeBoard2();
		}
		return board;
	}

	public void addNotice(String notice) {
		notices.add(notice);
	}

	public void realAllNotices() {
		for (Iterator iterator = notices.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
