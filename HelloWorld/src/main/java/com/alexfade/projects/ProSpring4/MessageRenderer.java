package com.alexfade.projects.ProSpring4;

/**
 * Created by Alexander Kovalevsky on 28.06.2016.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
