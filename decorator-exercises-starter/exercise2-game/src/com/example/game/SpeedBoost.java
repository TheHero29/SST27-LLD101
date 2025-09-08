package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private int boostAmount;

    public SpeedBoost(Character base, int boostAmount) {
        super(base);
        this.boostAmount = boostAmount;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + (getSpeed() + boostAmount) + " with sprite golden_" + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite golden_" + getSprite());
    }
}
