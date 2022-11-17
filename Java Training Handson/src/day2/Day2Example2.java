package day2;
import java.util.Scanner;

class Student {
	String name, course;
	int roll, sem;
	Student() {}
	Student(int roll, String name, String course, int sem) {
		this.name = name;
		this.roll = roll;
		this.sem = sem;
		this.course = course;
	}
	String getName() {
		return this.name;
	}
	String getCourse() {
		return this.course;
	}
	int getRoll() {
		return this.roll;
	}
	int getSem() {
		return this.sem;
	}
}
class Exam extends Student {
	int sub1, sub2, sub3, sub4, sub5;
	Exam(int sub1, int sub2, int sub3, int sub4, int sub5) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}
	int total() {
		return (sub1 + sub2 + sub3 + sub4 + sub5);
	}
	double grade() {
		double gr = (double) (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;
		return gr;
	}
}
public class Day2Example2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------Students Details--------------------------------- ");
		System.out.print("Roll = ");
		int roll = sc.nextInt();
		System.out.print("\nName = ");
		String name = sc.next();
		System.out.print("\nCourse = ");
		String course = sc.next();
		System.out.print("\nSemester = ");
		int sem = sc.nextInt();
		System.out.println("-----------------Marks For Subjects--------------------------------- ");
		System.out.print("\nSubject1 = ");
		int sub1 = sc.nextInt();
		System.out.print("\nSubject2 = ");
		int sub2 = sc.nextInt();
		System.out.print("\nSubject3 = ");
		int sub3 = sc.nextInt();
		System.out.print("\nSubject4 = ");
		int sub4 = sc.nextInt();
		System.out.print("\nSubject5 = ");
		int sub5 = sc.nextInt();
		System.out.print("\n");
		System.out.println("==========Students Details==============");
		Exam e = new Exam(sub1, sub2, sub3, sub4, sub5);
		Student st = new Student(roll, name, course, sem);
		System.out.println("Roll = " + st.getRoll());
		System.out.println("Name = " + st.getName());
		System.out.println("Course = " + st.getCourse());
		System.out.println("Sem = " + st.getSem());
		System.out.println("==========Marks Details==============");
		System.out.println("Sub1 = " + sub1);
		System.out.println("Sub2 = " + sub2);
		System.out.println("Sub3 = " + sub3);
		System.out.println("Sub4 = " + sub4);
		System.out.println("Sub5 = " + sub5);
		System.out.println("Total = " + e.total());
		double grade = e.grade();
		System.out.println("Percentage = " + grade);
		if(grade >= 70) {
			System.out.println("Grade = A");
		}
		else if(grade < 70 && grade >= 60) {
			System.out.println("Grade = B");
		}
		else if(grade < 60 && grade >= 50) {
			System.out.println("Grade = C");
		}
		else if(grade < 50 && grade >= 40) {
			System.out.println("Grade = D");
		}
		else {
			System.out.println("Grade = F");
		}
	}
}
