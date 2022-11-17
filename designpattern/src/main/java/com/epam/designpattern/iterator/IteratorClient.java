package com.epam.designpattern.iterator;

public class IteratorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionContainer container = new NamesCollection();
		Iterator itr = container.getIterator();
		
		for(Iterator iterator = itr; iterator.hasNext(); ) {
			String type = (String) iterator.next();
			System.out.println(type);
		}
		
	}

}
