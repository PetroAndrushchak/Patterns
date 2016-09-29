package com.epam.petroandrushchak;

import com.epam.petroandrushchak.cars.BMW;
import com.epam.petroandrushchak.cars.Ferrari;
import com.epam.petroandrushchak.cars.Lanos;
import com.epam.petroandrushchak.cars.Porsche;

public class CarFacade {

	private BMW bmw = new BMW();
	private Ferrari ferrari = new Ferrari();
	private Lanos lanos = new Lanos();
	private Porsche porsche = new Porsche();

	public void orderBMW() {
		bmw.build();
		bmw.pay();
		System.out.println(bmw);
	}

	public void orderFerrari() {
		ferrari.build();
		ferrari.pay();
		System.out.println(ferrari);
	}

	public void orderPorsche() {
		porsche.build();
		porsche.pay();
		System.out.println(porsche);
	}

	public void orderLanos() {
		lanos.build();
		System.out.println(lanos);
	}

}
