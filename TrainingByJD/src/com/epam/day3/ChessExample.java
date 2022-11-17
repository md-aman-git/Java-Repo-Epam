package com.epam.day3;

import java.util.Scanner;

public class ChessExample {

	static void printChess(char [][] chess) {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
	}
	static char[] insertCommand(String command, char [][] chess) {
		command = command.toLowerCase();
		char queenKing = command.charAt(0);
		if(queenKing == 'k' || queenKing == 'q') {
			char first = command.charAt(1);
			char second = command.charAt(2);
			if((first >= '1' && first <= '9') 
					|| (second >= '1' && second <= '9')) {
				char [] res = {queenKing, first, second};
				return res;
			}
		}
		char [] res = {'1'};
		return res;
	}
	static void setChars(char [][] chess, int x, int y) {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				chess[i][j] = 'E';
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] chess = new char[8][8];
		
		chess[3][4] = 'k';
		chess[6][5] = 'q';
		int x, y, newX, newY;
		printChess(chess);
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPlease enter command : ");
			String command = sc.next();
			char [] isValid = insertCommand(command, chess);
			if(isValid.length == 1) {
				System.out.println("Please enter a valid command.");
				continue;
			}
			
		}
	}

}
