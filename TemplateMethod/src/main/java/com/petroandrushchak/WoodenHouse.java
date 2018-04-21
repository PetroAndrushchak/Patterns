package com.petroandrushchak;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building WoodenHouse Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with WoodHouse coating");
    }

}