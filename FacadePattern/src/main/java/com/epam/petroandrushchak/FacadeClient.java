package com.epam.petroandrushchak;

public class FacadeClient {
	public static void main(String[] args) {
		CarFacade shop = new CarFacade();

		shop.orderBMW();
		shop.orderFerrari();
		shop.orderLanos();
		shop.orderPorsche();

	}
}
