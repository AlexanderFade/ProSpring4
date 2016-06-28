package com.alexfade.projects.ProSpring4;

/**
 * Created by Alexander Kovalevsky on 28.06.2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }
}
