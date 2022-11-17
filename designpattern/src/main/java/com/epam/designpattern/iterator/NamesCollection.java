package com.epam.designpattern.iterator;

public class NamesCollection implements CollectionContainer {

	public String [] names = {"Aman", "Vinay", "Sweta", "Shivkanya"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NamesCollectionIterator();
	}
	private class NamesCollectionIterator implements Iterator {
		int i;
		public boolean hasNext() {
			if(i < names.length) {
				return true;
			}
			return false;
		}
		public Object next() {
			if(this.hasNext()) {
				return names[i++];
			}
			return null;
		}
	}
}
