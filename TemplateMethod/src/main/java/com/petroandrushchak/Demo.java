package com.petroandrushchak;

public class Demo {

    public static void main(String[] args) {

        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();

        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

    }
}
