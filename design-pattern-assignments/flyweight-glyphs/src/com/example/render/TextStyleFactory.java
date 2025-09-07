package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static Map<String, TextStyle> styles = new HashMap<>();

    public static TextStyle getTextStyle(String fontFamily, int fontSize, String fontWeight) {
        String key = fontFamily + "|" + fontSize + "|" + fontWeight;
        if (!styles.containsKey(key)) {
            styles.put(key, new TextStyle(fontFamily, fontSize, fontWeight));
        }
        return styles.get(key);
    }
}
