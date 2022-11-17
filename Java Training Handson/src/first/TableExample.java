package first;
class Table {
	void table(int id, String name, String department, 
			String phone, String father, 
			String address) {
		String leftAlignFormat = "| %-2d | %-9s | %-10s | %-10s | %-13s | %-12s |%n";

		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
		System.out.format("|ID  | Name      | Department |Phone       | Father Name   | Address      |%n");
		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
		for (int i = 0; i < 5; i++) {
		    System.out.format(leftAlignFormat, id, name, department, phone, father, address);
		}
		System.out.format("+----+-----------+------------+------------+---------------+--------------+%n");
	}
}
public class TableExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Table().table(1, "name", "department", "phone", "father", "address");
	}

}
