package com.Abstract;

public class TestBird {
	
	public static void main(String[] args) {
		
		System.out.println("..... Console output of myBird ....");
		Animal myBird = new Bird();

		myBird.label();
		myBird.move();
		myBird.eat();
		
		System.out.println("...... Console output of myFish ....");
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}

