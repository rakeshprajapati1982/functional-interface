package com.readtorakesh.java8.functional_interface;

@FunctionalInterface
public interface DefaultGreeter {
	//Abstract method
	String greet(String name);
	
	//Default method
	default String getGreeting() {
		return "Hello";
	}
	
	//Static method
	static String suffix() {
		return ":-)";
	}
}
