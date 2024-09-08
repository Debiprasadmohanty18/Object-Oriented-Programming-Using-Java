package com.Interface;

public class Car implements Engine {

	@Override
	public void start() {
		System.out.println("Engine Started.");
	}

	@Override
	public void stop() {
		System.out.println("Engine Stopped.");
	}
}
