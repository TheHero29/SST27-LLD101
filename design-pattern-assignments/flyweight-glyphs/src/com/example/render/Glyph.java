package com.example.render;

public class Glyph {
    private final char ch;
    private TextStyle style;
    
    public Glyph(char ch, String font, int size, boolean bold) {
        this.ch = ch;
        this.style = TextStyleFactory.getTextStyle(font, size, bold ? "B" : "");
    }

    public int drawCost() {
        return style.getSize() + (style.isBold() ? 10 : 0);
    }

    public char getCh() {
        return ch;
    }

    public String getFont() {
        return style.getFont();
    }

    public int getSize() {
        return style.getSize();
    }

    public boolean isBold() {
        return style.isBold();
    }
}
