package com.example.render;
public class TextStyle {
    private String fontFamily;
    private int fontSize;
    private String fontWeight;

    public TextStyle(String fontFamily, int fontSize, String fontWeight) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
    }

    public int getSize() {
        return fontSize;
    }

    public boolean isBold() {
        return fontWeight.equals("B");
    }

    public String getFont() {
        return fontFamily;
    }

}
