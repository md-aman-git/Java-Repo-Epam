package day6;

import java.util.Scanner;

interface StudentInterface {
	class PrimaryDetails {
		private String first_name, last_name, 
			Date_of_Birth, date_of_joining;
		private int Student_id, aadhar;
		public PrimaryDetails() {}
		public PrimaryDetails(String first_name, String last_name, String date_of_Birth, String date_of_joining,
				int student_id, int aadhar) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			Date_of_Birth = date_of_Birth;
			this.date_of_joining = date_of_joining;
			Student_id = student_id;
			this.aadhar = aadhar;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getDate_of_Birth() {
			return Date_of_Birth;
		}
		public void setDate_of_Birth(String date_of_Birth) {
			Date_of_Birth = date_of_Birth;
		}
		public String getDate_of_joining() {
			return date_of_joining;
		}
		public void setDate_of_joining(String date_of_joining) {
			this.date_of_joining = date_of_joining;
		}
		public int getStudent_id() {
			return Student_id;
		}
		public void setStudent_id(int student_id) {
			Student_id = student_id;
		}
		public int getAadhar() {
			return aadhar;
		}
		public void setAadhar(int aadhar) {
			this.aadhar = aadhar;
		}
		void showPrimaryDetails() {
			System.out.println("......Student-Primary-Details....");
			System.out.println("Name : " + getFirst_name() + " " + getLast_name());
			System.out.println("DOB : " + getDate_of_Birth());
			System.out.println("DOJ : " + getDate_of_joining());
			System.out.println("Stud-ID : " + getStudent_id());
			System.out.println("AADHAR : " + getAadhar());
		}
	}
	class SecondaryDetails {
		private String father_name, mother_name, phone, email, address;
		public SecondaryDetails() {}
		public SecondaryDetails(String father_name, String mother_name, String phone, String email, String address) {
			super();
			this.father_name = father_name;
			this.mother_name = mother_name;
			this.phone = phone;
			this.email = email;
			this.address = address;
		}

		public String getFather_name() {
			return father_name;
		}

		public void setFather_name(String father_name) {
			this.father_name = father_name;
		}

		public String getMother_name() {
			return mother_name;
		}

		public void setMother_name(String mother_name) {
			this.mother_name = mother_name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		void showSecondaryDetails() {
			System.out.println("Father Name : " + getFather_name());
			System.out.println("Mother Name : " + getMother_name());
			System.out.println("Phone : " + getPhone());
			System.out.println("Email-ID : " + getEmail());
			System.out.println("Address : " + getAddress());
			System.out.println("........Student-Details-End....");
		}
	}
	void seeTheAnnouncements();
	void downloadReportTest();
	void submitAssignments();
	void applyLeave();
	void attendExamTests();
	void payFees();
}
interface StaffInterface {
	class Staff {
		private String first_name, last_name, qualification, subjects;
		private int experience;
		
		public Staff(String first_name, String last_name, String qualification, String subjects, int experience) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.qualification = qualification;
			this.subjects = subjects;
			this.experience = experience;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getSubjects() {
			return subjects;
		}
		public void setSubjects(String subjects) {
			this.subjects = subjects;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		void showStaffDetails() {
			System.out.println("........Staff-Details-Start......");
			System.out.println("Staff Name : " + getFirst_name() + " " + getLast_name());
			System.out.println("Qualification : " + getQualification());
			System.out.println("Subject : " + getSubjects());
			System.out.println("Experience : " + getExperience());
			System.out.println("........Staff-Details-End......");
		}
		
	}
	void setGrade(int grade);
	void uploadMarks(int marks);
	void setSection(String section);
	void markAttendance(boolean present);
	void giveAssignment();
	void createPeriodicTests();
	void uploadQuestionBanks(); 
	void prepareStudentReport(int student_id);
	void prepareOverallPerformance();
}
class Admin implements StudentInterface, StaffInterface {

	@Override
	public void setGrade(int grade) {
		// TODO Auto-generated method stub
		System.out.println("Grade set " + grade);
	}

	@Override
	public void uploadMarks(int marks) {
		// TODO Auto-generated method stub
		System.out.println("Marks uploaded " + marks);
	}

	@Override
	public void setSection(String section) {
		// TODO Auto-generated method stub
		System.out.println("Section set " + section);
	}

	@Override
	public void markAttendance(boolean present) {
		// TODO Auto-generated method stub
		System.out.println("Present = " + present);
	}

	@Override
	public void giveAssignment() {
		// TODO Auto-generated method stub
		System.out.println("Assignment given succesfully");
	}

	@Override
	public void createPeriodicTests() {
		// TODO Auto-generated method stub
		System.out.println("Created periodic test");
	}

	@Override
	public void uploadQuestionBanks() {
		// TODO Auto-generated method stub
		System.out.println("Question bank uploaded");
	}

	@Override
	public void prepareStudentReport(int student_id) {
		// TODO Auto-generated method stub
		System.out.println("Report prepared for student id : " + student_id);
	}

	@Override
	public void prepareOverallPerformance() {
		// TODO Auto-generated method stub
		System.out.println("Overall performance prepared...");
	}

	@Override
	public void seeTheAnnouncements() {
		// TODO Auto-generated method stub
		System.out.println("Here is anouncements.");
	}

	@Override
	public void downloadReportTest() {
		// TODO Auto-generated method stub
		System.out.println("Report downloaded");
	}

	@Override
	public void submitAssignments() {
		// TODO Auto-generated method stub
		System.out.println("Assignment submitted.");
	}

	@Override
	public void applyLeave() {
		// TODO Auto-generated method stub
		System.out.println("Leave applied");
	}

	@Override
	public void attendExamTests() {
		// TODO Auto-generated method stub
		System.out.println("Attended exam");
	}

	@Override
	public void payFees() {
		// TODO Auto-generated method stub
		System.out.println("Fee paid");
	}
	
}
public class CollegeDetailsExample {
	public static void main(String[] args) {
		
		StudentInterface.PrimaryDetails pd = new StudentInterface
				.PrimaryDetails("EPAM", "System", 
						"01-01-1998", "03-01-2022",
						1, 12345);
		pd.showPrimaryDetails();
		
		StudentInterface.SecondaryDetails sd = new StudentInterface
				.SecondaryDetails("ABCE", "DEFGH", 
						"1234567890", "epam@epam.com",
						"Hyderabad");
		sd.showSecondaryDetails();
		
		
		StaffInterface.Staff staff = new StaffInterface.Staff("ICE", 
				"EDGE", 
				"M.Tech", "JAVA",
				10);
		staff.showStaffDetails();
		
		System.out.println("-----------Admin Features-----------");
		
		Admin object = new Admin();
		object.applyLeave();
		object.markAttendance(true);
		object.prepareStudentReport(1);
		object.submitAssignments();
		object.attendExamTests();
		object.createPeriodicTests();
		object.downloadReportTest();
		object.payFees();
		object.seeTheAnnouncements();
		object.setGrade(100);
		object.setSection("A");
		object.uploadMarks(78);
		object.uploadQuestionBanks();
	}
}
