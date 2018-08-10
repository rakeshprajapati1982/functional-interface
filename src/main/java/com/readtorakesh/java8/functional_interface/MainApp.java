package com.readtorakesh.java8.functional_interface;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Greeter Lambda");
		System.out.println("------------------");
		Greeter greeter = o -> "Hi " + o;
		System.out.println(greeter.greet("Rakesh"));

		System.out.println("\n");

		System.out.println("DefaultGreeter Lambda");
		System.out.println("------------------");
		DefaultGreeter defaultGreeter = o -> "Hi " + o + " " + DefaultGreeter.suffix();
		System.out.println(defaultGreeter.greet("Rakesh"));
	}
}
