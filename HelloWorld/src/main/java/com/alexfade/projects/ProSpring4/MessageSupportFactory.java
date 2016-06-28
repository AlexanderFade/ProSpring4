package com.alexfade.projects.ProSpring4;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.nio.file.*;

/**
 * Created by Alexander Kovalevsky on 28.06.2016.
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private String propFileName = "/HelloWorld/src/main/java/com/alexfade/projects/ProSpring4/msf.properties";

    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream(Paths.get("").toAbsolutePath().toString() + propFileName));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
