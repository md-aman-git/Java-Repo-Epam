package com.epam.designpattern.singletonpattern;

public class NoticeBoard {
	private NoticeBoard() {}
	//early instantiation
	private static NoticeBoard board = new NoticeBoard();
	public static NoticeBoard getInstance() {
		return board;
	}
}
