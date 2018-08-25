package org.niranjan.string.practice.immutable;

public final class CustomImmutableObject {
	private final Integer value;
	public CustomImmutableObject() {
		super();
		this.value = 0;
	}
	
	public CustomImmutableObject(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}