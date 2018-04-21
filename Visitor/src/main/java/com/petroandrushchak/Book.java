package com.petroandrushchak;

public class Book implements Element{

    private int price;

    Book(int price){
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }

    @Override
    public int calculateCost(ElementCostVisitor visitor) {
        return visitor.calculateCost(this);
    }
}
