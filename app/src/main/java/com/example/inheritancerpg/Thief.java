package com.example.inheritancerpg;

public class Thief extends Light{

    // Thief class: Light unit with the special attribute of dodging attacks based on evasion.
    // Evasion value must be greater than 0, but less than 1.

    public Thief() {
        // default constructor
    }

    public Thief(String name, int totalHP, double evasion, int minDMG, int maxDMG) {
        super.lightName = name;
        super.lightTotalHP = totalHP;
        super.evasion = evasion;
        super.lightMinDMG = minDMG;
        super.lightMaxDMG = maxDMG;
    }
}
