package com.petroandrushchak;

public class ElementCostCalculationVisitor implements ElementCostVisitor {

    @Override
    public int calculateCost(Book book) {
        if (book.getPrice() < 45){
            return 2;
        }else if (book.getPrice() < 30){
            return 1;
        }else {
            return 0;
        }
    }
}
