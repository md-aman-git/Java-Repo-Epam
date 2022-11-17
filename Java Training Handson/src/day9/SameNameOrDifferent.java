package day9;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class SameNameOrDifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\testing1.txt";
		String path2 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\testing2.txt";
		try {
			Reader read1 = new FileReader(path1);
			Reader read2 = new FileReader(path2);
			
			int data1 = 0, data2 = 0;
			ArrayList<String> name1 = new ArrayList<String>();
			ArrayList<String> name2 = new ArrayList<String>();
			String str = "";
			while((data1 = read1.read()) != -1) {
				if((char) data1 == ' ') {
					name1.add(str);
					str = "";
					continue;
				}
				str += (char) data1;
			}
			name1.add(str);
			System.out.println("name1 = " + name1);
			str = "";
			while((data2 = read2.read()) != -1) {
				if((char) data2 == ' ') {
					name2.add(str);
					str = "";
					continue;
				}
				str += (char) data2;
			}
			name2.add(str);
			System.out.println("name2 = " + name2);
			ArrayList<String> diff = new ArrayList<String>();
			for(String value : name1) {
				if(!name2.contains(value)) {
					diff.add(value);
				}
			}
			for(String value : name2) {
				if(!name1.contains(value)) {
					diff.add(value);
				}
			}
			System.out.println("Not contains in both files = " + diff);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
	}

}
