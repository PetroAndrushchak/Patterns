package com.epam.petroandrushchak;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("shape");
		Shape shape = factory.getShape("Square");
		shape.draw();
	
		factory = FactoryProducer.getFactory("color");
		Color color = factory.getColor("red");
		color.fill();
	}
}
