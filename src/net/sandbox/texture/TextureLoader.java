package net.sandbox.texture;

import java.util.HashMap;
import java.awt.Image;

public class TextureLoader {
    public static String TEXTURES_RELATIVE_PATH = "./resources/textures/";
    public static HashMap<String, Image> cache = new HashMap<String, Image>();
    public static Image getTexture(String key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            // load texture
            // add to cache
        }
    }
}