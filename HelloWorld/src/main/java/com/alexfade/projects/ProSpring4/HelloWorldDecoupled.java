package com.alexfade.projects.ProSpring4;

/**
 * Created by Alexander Kovalevsky on 28.06.2016.
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
