package com.petroandrushchak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Iphone iphone = new Iphone();

        User user1 = new User("Petro");
        User user2 = new User("Pavlo");

        iphone.addObserver(user1);
        iphone.addObserver(user2);
        iphone.updateStatus(true);



    }
}
