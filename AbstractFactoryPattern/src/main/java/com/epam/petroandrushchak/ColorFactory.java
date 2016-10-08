package com.epam.petroandrushchak;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		switch (color) {
		case "red":
			return new Red();
		case "blue":
			return new Blue();
		case "green":
			return new Green();
		default:
			break;
		}
		return null;
	}

}
