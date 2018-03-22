package com.petroandrushchak;

public class MP3PlayerContext {

    State state;


    boolean isRunning = false;

    void setState(State state){
        this.state = state;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void perform(){
        state.doAction(this);
    }

}
