package com.example.inheritancerpg;

public class Assassin extends Light {

    // Assassin class: Light unite with the special attribute of being able to deal damage.
    // Double damage chance is based on evasion.

    public Assassin() {
        // default constructor
    }

    public Assassin(String name, int totalHP, double evasion, int minDMG, int maxDMG) {
        super.lightName = name;
        super.lightTotalHP = totalHP;
        super.evasion = evasion;
        super.lightMinDMG = minDMG;
        super.lightMaxDMG = maxDMG;
    }

}
