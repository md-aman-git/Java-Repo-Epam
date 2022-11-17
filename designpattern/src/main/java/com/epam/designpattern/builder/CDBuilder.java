package com.epam.designpattern.builder;

public class CDBuilder {
	public CDType buildSony() {
		CDType cd = new CDType();
		cd.addItem(new Sony());
		return cd;
	}
	public CDType buildSamsung() {
		CDType cd = new CDType();
		cd.addItem(new Samsung());
		return cd;
	}
}
