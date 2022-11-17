package com.epam.designpattern.singletonpattern;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//noticeBoard as early initialization
		NoticeBoard board = NoticeBoard.getInstance();
		System.out.println("Object created once : " + board);
		board = NoticeBoard.getInstance();
		System.out.println("Object created once : " + board);
		
		//noticeBoard2 as lazy initialization
		NoticeBoard2 board2 = NoticeBoard2.getInstance();
		System.out.println("Object created once : " + board2);
		board2 = NoticeBoard2.getInstance();
		System.out.println("Object created once : " + board2);
		
		//Read notice
		StudentReader reader = new StudentReader();
		NoticeBoard2 board3 = NoticeBoard2.getInstance();
		reader.readAllNotice();
		board3.addNotice("Added notice in main class");
		board3.realAllNotices();
	}

}
