package com.petroandrushchak;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building GlassHouse walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building GlassHouse pillars");

    }
}
