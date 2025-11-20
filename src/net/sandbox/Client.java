package net.sandbox;

import java.util.logging.Logger;

import net.sandbox.window.Window;
import net.sandbox.window.Canvas;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Initializing Client...");
        Canvas.bindInstance(new Canvas());
        Window.bindInstance(new Window());
    }
}