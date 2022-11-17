package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

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
		//Modified selection sort.......
		System.out.println("Arraylist Non-sorted : " + al);
		int size = al.size();
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(al.get(i).compareTo(al.get(j)) < 0) {
					String temp = al.get(i);
					String temp2 = al.get(j);
					al.remove(j);
					al.add(j, temp);
					al.remove(i);
					al.add(i, temp2);
				}
			}
		}
		System.out.println("Arraylist reverse sorted : " + al);
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(al.get(i).compareTo(al.get(j)) > 0) {
					String temp = al.get(i);
					String temp2 = al.get(j);
					al.remove(j);
					al.add(j, temp);
					al.remove(i);
					al.add(i, temp2);
				}
			}
		}
		System.out.println("Arraylist sorted : " + al);
	}

}
