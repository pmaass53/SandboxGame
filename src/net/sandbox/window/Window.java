package net.sandbox.window;

import javax.swing.JFrame;
import java.util.logging.Logger;

public class Window extends JFrame {
    private static final Logger LOGGER = Logger.getLogger(Window.class.getName());
    private static Window windowInstance;
    public static void bindInstance(Window instance) {
        Window.windowInstance = instance;
    }
    public static Window getInstance() {
        return Window.windowInstance;
    }
    public void bindCanvas(Canvas c) {
        add(c);
    }
    public Window() {
        LOGGER.info("Initializing Window...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sandbox v0.1");
        setSize(640, 640);
        setLocationRelativeTo(null);
        setLocation(0, 0);
        setVisible(true);
    }
}