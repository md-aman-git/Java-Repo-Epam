package com.epam.day8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFiles {
	public static void main(String[] args) {
		try {
			Stream<String> fileStringStream = 
					Files
					.lines(Paths
							.get("C:\\Users\\Md_Aman\\Documents\\GitProjects\\epam_java_train\\SampleCode\\bands.txt"));
			fileStringStream.sorted().forEach(System.out::println);
			fileStringStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
