package com.Interface;

public class MainCar {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.start();
//		car.stop();
		
//		Media operateCD = new Car();
//		operateCD.stop();
//		operateCD.start();
		
		NewCar car = new NewCar();
		car.startEngine();
		car.startMusic();
		car.updateEngine(new ElectricEngine());
		car.startEngine();
		
		
		
		
	}

}
