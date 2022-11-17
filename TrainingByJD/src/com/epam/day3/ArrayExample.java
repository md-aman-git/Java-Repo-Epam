package com.epam.day3;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1, 3}, {4, 8}, {9, 1}};
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}

}
