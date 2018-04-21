package com.petroandrushchak;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Book book1 = new Book(33);
        Book book2 = new Book(23);
        List<Element> elements = new ArrayList<>();
        elements.add(book1);
        elements.add(book2);

        ElementCostCalculationVisitor visitor = new ElementCostCalculationVisitor();

        int sum = 0;
        for (Element element : elements){
            sum += element.calculateCost(visitor);
        }

        System.out.println(sum);

    }
}
