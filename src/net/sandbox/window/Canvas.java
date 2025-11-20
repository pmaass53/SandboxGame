package net.sandbox.window;

import javax.swing.JPanel;

public class Canvas extends JPanel {
    private static Canvas canvasInstance;
    public static void bindInstance(Canvas instance) {
        Canvas.canvasInstance = instance;
    }
    public static Canvas getInstance() {
        return Canvas.canvasInstance;
    }
}