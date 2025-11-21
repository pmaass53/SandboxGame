package net.sandbox.window;

import java.util.logging.Logger;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;

public class Canvas extends JPanel {
    private static final Logger LOGGER = Logger.getLogger(Canvas.class.getName());
    private static Canvas canvasInstance;
    public static void bindInstance(Canvas instance) {
        Canvas.canvasInstance = instance;
    }
    public static Canvas getInstance() {
        return Canvas.canvasInstance;
    }
    public Canvas() {
        setPreferredSize(new Dimension(640, 640));
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillRect(0, 0, 500, 500);
    }
}