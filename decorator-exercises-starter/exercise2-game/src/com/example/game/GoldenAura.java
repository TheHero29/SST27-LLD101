package com.example.game;

public class GoldenAura extends CharacterDecorator {

    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite golden_" + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite golden_" + getSprite());
    }
}
