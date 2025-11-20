package net.sandbox.window;

import javax.swing.JFrame;
import java.util.logging.Logger;

public class Window extends JFrame {
    private static final Logger LOGGER = Logger.getLogger(Window.class.getName());
    private static Window windowInstance;
    public static void bindInstance(Window instance) {
        LOGGER.info("Creating Window Instance...");
        Window.windowInstance = instance;
    }
    public static Window getInstance() {
        return Window.windowInstance;
    }
    public void bindCanvas(Canvas c) {
        LOGGER.info("Binding Canvas to Window...");
        add(c);
    }
    public Window() {
        LOGGER.info("Initializing Window...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sandbox v0.1");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLocation(0, 0);
        setVisible(true);
        LOGGER.info("Created Window");
    }
}