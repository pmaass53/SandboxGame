package net.sandbox;

import java.util.logging.Logger;

import net.sandbox.window.Window;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Initializing Client...");
        Window.bindInstance(new Window());
    }
}