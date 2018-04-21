package com.petroandrushchak;

public interface Element {
    int calculateCost(ElementCostVisitor visitor);
}
