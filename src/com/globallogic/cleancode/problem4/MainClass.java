package com.globallogic.cleancode.problem4;

public class MainClass {

	public static void main(String[] args) {
		Bird parrot = new Parrot();
		Bird penguin = new Penguin();
		
		playWithBird(parrot);
		playWithBird(penguin);

	}

	private static void playWithBird(Bird bird) {
		bird.fly();
	}
}
