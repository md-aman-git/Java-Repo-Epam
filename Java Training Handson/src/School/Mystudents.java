package School;

class Student {
	private String Student_ID;
	private String firstname;
	private String lastname;
	private String Date_of_Birth;
	private String Aadhar_Number;
	private String date_of_joining;
	private String Father_name;
	private String Mother_name;
	private String MobNo;
	private String Email_Address;

	public void SeeAnnouncement_News() {
		System.out.println("Announcement and News Section Coming soon");
	}

	public void downloadTestReport() {
		System.out.println("Test Report Downloaded");
	}

	public void AssignmentSubmision() {
		System.out.println("Assignment completed");
	}

	public void ApplyLeave() {
		System.out.println("Applied Leave");
	}

	public void Examination() {
		System.out.println("Examination given");
	}

	public void FeePayment() {
		System.out.println("Fee Paid");
	}

}

public class Mystudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student X = new Student();
		
	}

}
