package com.epam.petroandrushchak.cars;

public class BMW implements Car, CustomsTaxable{

	private StringBuilder bmw= new StringBuilder();

	public void build() {
		bmw.append("BMW : ");
		bmw.append("White color, ");
		bmw.append("Four whiles, ");
		bmw.append("6 speed gearbox, ");
		bmw.append("220 max speed, ");
		bmw.append("Spoiler, ");
	}
	
	public void pay() {
		bmw.append("1000 dolars customs tax ");
	}

	@Override
	public String toString() {
		return bmw.toString();
	}



}
