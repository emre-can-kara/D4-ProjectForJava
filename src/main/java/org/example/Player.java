package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor (Validates healthPercentage)
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // Returns the current health percentage
    public int healthRemaining() {
        return healthPercentage;
    }

    // Decreases health by damage amount
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of the game");
        }
    }

    // Restores health but does not exceed 100
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}
