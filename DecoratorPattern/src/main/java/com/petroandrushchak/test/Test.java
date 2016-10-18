package com.petroandrushchak.test;

public class Test {

	public static void main(String[] args) {
		Car car = new SuperCar(new SuperCar(new SuperCar(new BasicCar())));
		car.run();
	}
}
