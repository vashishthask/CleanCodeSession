package com.globallogic.cleancode.problem4;

public class Penguin implements Bird {

	@Override
	public void fly() {
		throw new IllegalStateException("Penguins don't fly");
	}
}