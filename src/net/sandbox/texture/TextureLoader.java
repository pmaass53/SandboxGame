package net.sandbox.texture;

import java.util.HashMap;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.logging.Logger;

public class TextureLoader {
    private static final Logger LOGGER = Logger.getLogger(TextureLoader.class.getName());
    public static String TEXTURES_RELATIVE_PATH = "./resources/textures/";
    public static HashMap<String, Image> cache = new HashMap<String, Image>();
    public static Image getTexture(String key) {
        if (!cache.containsKey(key)) {
            cache.put(key, readFromFile(key));
        }
        return cache.get(key);
    }
    public static Image readFromFile(String fileName) {
        try {
            Image img = ImageIO.read(new File(TEXTURES_RELATIVE_PATH + fileName));
            return img;
        } catch (Exception e) {
            LOGGER.severe("Error Loading Image from File: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}