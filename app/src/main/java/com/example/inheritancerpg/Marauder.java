package com.example.inheritancerpg;

public class Marauder extends Monster{

    // Marauder class: Enemy/Monster unit, slight resistance to magic.
    // Takes 30% less damage from magic-based attacks.

    public Marauder() {
        // default constructor
    }

    public Marauder(String name, int totalHP, int minDMG, int maxDMG) {
        super.monsterName = name;
        super.monsterTotalHP = totalHP;
        super.monsterMinDMG = minDMG;
        super.monsterMaxDMG = maxDMG;
        super.magiRes = true;
    }
}
