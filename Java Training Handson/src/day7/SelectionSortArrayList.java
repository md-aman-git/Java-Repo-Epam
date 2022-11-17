package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 strings in arrayList = ");
		Scanner sc = new Scanner(System.in);
		int n = 5;
		ArrayList<String> al = new ArrayList<String>();
		while(n-- > 0) {
			String value = sc.next();
			al.add(value);
		}
		sc.close();
		System.out.println("Arraylist Non-sorted : " + al);
		int size = al.size();
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				int minIndex = i;
				if(al.get(minIndex).compareTo(al.get(j)) > 0) {
					minIndex = j;
				}
				String temp = al.get(minIndex);
				String temp2 = al.get(i);
				al.remove(i);
				al.add(i, temp);
				al.remove(minIndex);
				al.add(minIndex, temp2);
			}
		}
		System.out.println("Arraylist ascending sorted : " + al);
		for(int i = 0; i < size; i++) {
			for(int j = i; j < size; j++) {
				int minIndex = i;
				if(al.get(minIndex).compareTo(al.get(j)) < 0) {
					minIndex = j;
				}
				String temp = al.get(minIndex);
				String temp2 = al.get(i);
				al.remove(i);
				al.add(i, temp);
				al.remove(minIndex);
				al.add(minIndex, temp2);
			}
		}
		System.out.println("Arraylist descending sorted : " + al);
	}

}
