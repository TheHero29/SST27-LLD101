package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int boostAmount;

    public DamageBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + (getDamage() + boostAmount) + " using sprite " + getSprite());
    }
}
