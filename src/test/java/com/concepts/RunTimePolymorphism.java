package com.concepts;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// Creating Object of Another Class
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
		//Creating Parent Reference with Child Object (Polymorphism)
		Animal animal = new Dog(); // Parent reference, Child object
		animal.sound(); // Method call
	}

}
