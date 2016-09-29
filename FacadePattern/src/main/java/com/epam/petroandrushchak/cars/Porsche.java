package com.epam.petroandrushchak.cars;

public class Porsche implements Car, CustomsTaxable{
	
	private StringBuilder porsche = new StringBuilder();;

	public void build() {
		porsche.append("Porsche : ");
		porsche.append("Yellow color, ");
		porsche.append("Four whiles, ");
		porsche.append("8 speed gearbox, ");
		porsche.append("350 max speed, ");
		porsche.append("Turbo motor, ");
	}
	
	public void pay() {
		porsche.append("1800 dolars customs tax ");
	}

	@Override
	public String toString() {
		return porsche.toString();
	}
		
}
