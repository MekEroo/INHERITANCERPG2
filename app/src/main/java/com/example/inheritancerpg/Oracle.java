package com.example.inheritancerpg;

public class Oracle extends Mage{

    // Oracle class: Mage unit with special attribute of increasing damage and health points based on wisdom.
    // Damage is increased by 20% per point of wisdom. Health points is increased by 30% per point of wisdom.

    public Oracle() {
        // default constructor
    }

    public Oracle(String name, int totalHP, int wisdom, int minDMG, int maxDMG) {
        super.mageName = name;
        totalHP += Math.round(wisdom * 0.50); // HP is increased by 50% per point of wisdom
        super.mageTotalHP = totalHP;
        minDMG += Math.round(wisdom * 0.20); // Damage is increased by 15% per point of wisdom
        maxDMG += Math.round(wisdom * 0.20); // Damage is increased by 15% per point of wisdom
        super.mageMinDMG = minDMG;
        super.mageMaxDmg = maxDMG;
    }
}
