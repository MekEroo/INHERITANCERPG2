package com.example.inheritancerpg;

public class Wizard extends Mage{

    // Wizard class: Mage unit with special attribute of increasing damage based on wisdom stat.
    // Damage is increased by 45% per point of wisdom.

    public Wizard() {
        // default constructor
    }

    public Wizard(String name, int totalHP, int wisdom, int minDMG, int maxDMG) {
        super.mageName = name;
        super.mageTotalHP = totalHP;
        minDMG += Math.round(wisdom * 0.45); // Damage is increased by 60% per point of wisdom
        maxDMG += Math.round(wisdom * 0.45); // Damage is increased by 60% per point of wisdom
        super.mageMinDMG = minDMG;
        super.mageMaxDmg = maxDMG;

    }
}
