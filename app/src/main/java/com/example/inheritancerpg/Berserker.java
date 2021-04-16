package com.example.inheritancerpg;

public class Berserker extends Heavy{

    // Berserker class: Heavy unit with the special attribute of dealing increased damage based on lost health.
    // Dmg points increase by 25% per point of health lost

    public Berserker() {
        // default constructor
    }

    public Berserker(String name, int totalHP, int minDMG, int maxDMG) {
        super.heavyName = name;
        super.heavyTotalHP = totalHP;
        super.heavyMinDMG = minDMG;
        super.heavyMaxDMG = maxDMG;
    }
}
