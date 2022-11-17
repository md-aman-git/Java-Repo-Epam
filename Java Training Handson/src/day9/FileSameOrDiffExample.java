package day9;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;

public class FileSameOrDiffExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\testing1.txt";
		String path2 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\testing2.txt";
		try {
			Reader fin1 = new FileReader(path1);
			Reader fin2 = new FileReader(path2);
			
			int data1 = 0, data2 = 0;
			boolean diff = false;
			while((data1 = fin1.read()) != -1 
					&& (data1 = fin2.read()) != -1) {
				if(data1 != data2) {
					diff = true;
				}
			}
			if(!diff) {
				System.out.println("Same");
			}
			else {
				System.out.println("Different");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
	}

}
