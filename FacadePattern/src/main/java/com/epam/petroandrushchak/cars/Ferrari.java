package com.epam.petroandrushchak.cars;

public class Ferrari implements Car, CustomsTaxable{
	
	private StringBuilder ferrari = new StringBuilder();;

	public void build() {
		ferrari.append("Ferrari : ");
		ferrari.append("Red color, ");
		ferrari.append("Four whiles, ");
		ferrari.append("7 speed gearbox, ");
		ferrari.append("280 max speed, ");
		ferrari.append("Spoile,r ");
		ferrari.append("Turbo motor, ");
	}
	
	public void pay() {
		ferrari.append("1500 dolars customs tax ");
	}

	@Override
	public String toString() {
		return ferrari.toString();
	}




}
