package net.sandbox.window;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Canvas extends JPanel {
    private static Canvas canvasInstance;
    public static void bindInstance(Canvas instance) {
        Canvas.canvasInstance = instance;
    }
    public static Canvas getInstance() {
        return Canvas.canvasInstance;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillRect(0, 0, 500, 500);
    }
}