package com.exercise11oop.app;

import com.exercise11oop.model.Dog;

public class DogApp {

	public static void main(String[] args) {
		Dog camila = new Dog(1, "camila", "Mestiza", 9, 60);
		
		System.out.format("camila's  age %d", camila.age);
	}

}
