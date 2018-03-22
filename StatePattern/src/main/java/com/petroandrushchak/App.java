package com.petroandrushchak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MP3PlayerContext context = new MP3PlayerContext();

        State stopState = new StopMP3PlayerState();
        State startState = new StartMP3PlayerState();

        context.setState(stopState);
        context.perform();

        context.setState(stopState);
        context.perform();

        context.setState(startState);
        context.perform();

        context.setState(startState);
        context.perform();

    }
}
