package com.epam.corejava.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class MultiCatch {
	public int getPlayerScore(String playerFile) {
	    try (Scanner contents = new Scanner(new File(playerFile)) ) {
	        return Integer.parseInt(contents.nextLine());
	    } catch (FileNotFoundException e) {
	        System.out.println("Player file not found!");
	        return 0;
	    } catch (IOException e) {
	    	System.out.println("Player file wouldn't load!");
	        return 0;
	    } catch (NumberFormatException e) {
	    	System.out.println("Player file was corrupted!");
	        return 0;
	    }
	}
}

class UnionCatch {
	public int getPlayerScore(String playerFile) {
	    try (Scanner contents = new Scanner(new File(playerFile))) {
	        return Integer.parseInt(contents.nextLine());
	    } catch (IOException | NumberFormatException e) {
	    	System.out.println("Failed to load score!");
	        return 0;
	    }
	}
}

public class TryCatch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
