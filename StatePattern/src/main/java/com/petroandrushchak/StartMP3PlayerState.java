package com.petroandrushchak;

public class StartMP3PlayerState  implements State {

    public void doAction(MP3PlayerContext context) {
        if (context.isRunning()){
            System.out.println("Already running");
        }else {
            context.setRunning(true);
            System.out.println("Pres start button");
        }

    }
}
