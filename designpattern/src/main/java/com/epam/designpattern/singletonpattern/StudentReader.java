package com.epam.designpattern.singletonpattern;

public class StudentReader {
	void readAllNotice() {
		NoticeBoard2 board = NoticeBoard2.getInstance();
		board.addNotice("Good Morning everyone");
		NoticeBoard2 board2 = NoticeBoard2.getInstance();
		board2.realAllNotices();
	}
}
