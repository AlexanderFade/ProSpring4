package com.alexfade.projects.ProSpring4;

/**
 * Created by Alexander Kovalevsky on 28.06.2016.
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
//C:\Users\Alexander Kovalevsky\Projects\ProSpring4\HelloWorld\src\main\java\com\alexfade\projects\ProSpring4\msf.properties