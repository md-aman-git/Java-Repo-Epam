package com.epam.designpattern.builder;

public class BuilderClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDBuilder cdb = new CDBuilder();
		CDType cdSamsung = cdb.buildSamsung();
		cdSamsung.showItems();
		
		CDType cdSony = cdb.buildSony();
		cdSony.showItems();
	}

}
