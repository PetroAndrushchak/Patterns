package com.epam.petroandrushchak;

public class ShapeFactory implements AbstractFactory {

	public Shape getShape(String shape) {

		switch (shape) {
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		default:
			return null;
		}
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
