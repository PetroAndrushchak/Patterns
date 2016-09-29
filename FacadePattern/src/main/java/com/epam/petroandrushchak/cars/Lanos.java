package com.epam.petroandrushchak.cars;

public class Lanos implements Car{
	
	private StringBuilder lanos = new StringBuilder();;
	
	public void build(){
		lanos.append("Lanos : ");
		lanos.append("Black color, ");
		lanos.append("Four whiles, ");
		lanos.append("5 speed gearbox, ");
		lanos.append("180 max speed, ");
	}
	
	@Override
	public String toString() {
		return lanos.toString();
	}

}
