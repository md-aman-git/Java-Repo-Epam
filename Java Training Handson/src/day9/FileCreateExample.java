package day9;

import java.io.File;

public class FileCreateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\testFileCreator.txt";
			File file = new File(path);
			if(file.createNewFile()) {
				System.out.println("New File Created");
			}
			else {
				System.out.println("File already exist.");
			} 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
