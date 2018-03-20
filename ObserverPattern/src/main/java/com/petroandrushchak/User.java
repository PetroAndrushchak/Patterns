package com.petroandrushchak;

import javax.jws.soap.SOAPBinding;

public class User implements Observer {

    private Observable observable = null;
    private String name;

    public User(Observable observable){
        this.observable = observable;
    }

    User(String name){
        this.name = name;
    }

    public void update() {
        buyStuff();
    }

    private void buyStuff(){
        System.out.println("You have bought a stuff");
    }

    public void unsubscribe(){
        observable.removeObserver(this);
    }
}
