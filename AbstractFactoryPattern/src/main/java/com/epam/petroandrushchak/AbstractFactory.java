package com.epam.petroandrushchak;

public interface AbstractFactory {
		
	Shape getShape(String shape);
	Color getColor(String color);
	
}
