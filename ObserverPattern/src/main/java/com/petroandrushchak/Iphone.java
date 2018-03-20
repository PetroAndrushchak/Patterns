package com.petroandrushchak;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Observable {

    private List<Observer> users = new ArrayList<>();

    private boolean isFree = true;

    public void addObserver(Observer o) {
        users.add(o);
    }

    public void removeObserver(Observer o) {
        users.remove(o);
    }

    public void notifyObservers() {
        for(Observer observer : users){
            observer.update();
        }
    }

    public void updateStatus(boolean status){
        this.isFree = status;
        notifyObservers();
    }
}
