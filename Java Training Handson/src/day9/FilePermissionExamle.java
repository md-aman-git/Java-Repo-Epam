package day9;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\test2.txt";
		String dir = "C:\\\\\\\\Users\\\\\\\\Md_Aman\\\\\\\\Documents\" + \r\n"
				+ "				\"\\\\\\\\DemoJava\\\\\\\\-";
		FilePermission file1 = new FilePermission(dir, "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		FilePermission file2 = new FilePermission(path, "write");
		//PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file2);
		if(permission.implies(new FilePermission(path, "read,write"))) {
			System.out.println("Read/Write");
		}
		else {
			System.out.println("not Read/Write");
		}
	}

}
