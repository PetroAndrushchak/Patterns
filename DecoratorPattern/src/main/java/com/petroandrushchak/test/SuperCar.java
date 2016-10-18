package com.petroandrushchak.test;

public class SuperCar extends CarDecorator {

	public SuperCar(Car car) {
		super(car);
	}
	
	public void run(){
		super.run();
		System.out.println("Super Car");
	}
}
