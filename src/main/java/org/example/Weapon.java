package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    GUN(80, 0.8),
    BOW(40, 1.5),
    AXE(60, 1.0);

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }


    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
