package org.niranjan.string.practice.immutable;

public class Test {

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	public static void main(String[] args) {
		CustomImmutableObject object = new CustomImmutableObject(10);
		System.out.println(object.getValue().hashCode());
		
		CustomImmutableObject object1 = new CustomImmutableObject(10);
		System.out.println(object1.getValue().hashCode());
		
		System.out.println(object == object1);
	}
}