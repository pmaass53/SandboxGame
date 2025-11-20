package net.sandbox.window;

import javax.swing.JFrame;

public class Window extends JFrame {
    private static Window windowInstance;
    public static void bindInstance(Window instance) {
        Window.windowInstance = instance;
    }
    public static Window getInstance() {
        return Window.windowInstance;
    }
    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sandbox v0.1");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLocation(0, 0);
        setVisible(true);
    }
}