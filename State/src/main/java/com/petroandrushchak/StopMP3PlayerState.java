package com.petroandrushchak;

public class StopMP3PlayerState implements State {

    public void doAction(MP3PlayerContext context) {
        if (context.isRunning()){
            context.setRunning(false);
            System.out.println("Stopping player from running");
        }else {
            System.out.println("Player is not running");
        }
    }
}
