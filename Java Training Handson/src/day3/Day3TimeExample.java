package day3;
import java.util.Scanner;

class Time {
	int hh, mm, ss;
	void input() {
		System.out.print("Enter time hours = ");
		Scanner sc = new Scanner(System.in);
		hh = sc.nextInt();
		System.out.print("Enter time minutes = ");
		mm = sc.nextInt();
		System.out.print("Enter time seconds = ");
		ss = sc.nextInt();
	}
	void display() {
		System.out.println("Time = " + hh + ":" + mm + ":" + ss);
	}
	String AddTime(Time time) {
		String res = "";
		int sec = time.ss + ss;
		int minute = 0;
		if(sec > 59) {
			sec -= 60;
			minute++;
		}
		int min = minute + time.mm + mm, hour = 0;
		if(min > 59) {
			min -= 60;
			hour++;
		}
		int hr = time.hh + hh + hour;
		res += hr + ":" + min + ":" + sec;
		return res;
	}
	String SubTime(Time time) {
		String res = "";
		int sec = time.ss - ss;
		if(time.ss < ss) {
			sec = time.ss + 60 - ss;
			time.mm--;
		}
		int min = time.mm - mm;
		if(time.mm < mm) {
			min = time.mm + 60 - mm;
			time.hh--;
		}
		int hr = time.hh - hh;
		res += hr + ":" + min + ":" + sec;
		return res;
	}
}
public class Day3TimeExample {
	public static void main(String [] args) {
		Time time = new Time();
		time.input();
		time.display();
		Time t2 = new Time();
		t2.input();
		t2.display();
		String res = time.AddTime(t2);
		System.out.println("Sum time  = " + res);
		if(time.hh >= t2.hh) {
			res = t2.SubTime(time);
		}
		else {
			res = time.SubTime(t2);
		}
		System.out.println("Difference time  = " + res);
	}
}
