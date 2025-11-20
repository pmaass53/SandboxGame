package net.sandbox.window;

public class Window {
    private static Window windowInstance;
    public static void bindInstance(Window instance) {
        Window.windowInstance = instance;
    }
    public static Window getInstance() {
        return Window.windowInstance;
    }
}