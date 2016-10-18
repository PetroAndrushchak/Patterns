package com.petroandrushchak.test;

public class CarDecorator implements Car {

	private Car car;
	
	public CarDecorator(Car car){
		this.car = car;
	}
	
	public void run() {
		car.run();
	}

}
